package com.example.spa_case.controller;

import com.example.spa_case.model.Customer;
import com.example.spa_case.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerRestController {


    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomerList() {
        List<Customer> customerList = customerService.getCustomerList();
        return ResponseEntity.ok(customerList);
    }


    @PostMapping
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
        return ResponseEntity.ok("Customer added successfully");
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<String> updateCustomer(@PathVariable("customerId") Long customerId, @RequestBody Customer customer) {
        // Kiểm tra customerId tồn tại trong hệ thống (nếu cần)
        // Nếu không tìm thấy customerId, trả về ResponseEntity.notFound().build()

        customerService.updateCustomer(customer);
        return ResponseEntity.ok("Customer updated successfully");
    }


    @GetMapping("/{customerId}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable("customerId") Long customerId) {
        Optional<Customer> customer = customerService.findById(customerId);
        if (customer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(customer);
    }

}
