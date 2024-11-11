package kpd.wasun.sbt.openfeign.controller;

import kpd.wasun.sbt.openfeign.dto.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/customers")
public class InternalCustomerController {

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> findById(@PathVariable String id) {
        return "C001".equals(id) ?
                ResponseEntity.ok(new CustomerDto("C001", "JP")) :
                ResponseEntity.notFound().build();
    }
}
