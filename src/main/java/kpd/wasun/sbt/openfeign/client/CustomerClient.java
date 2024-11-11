package kpd.wasun.sbt.openfeign.client;

import kpd.wasun.sbt.openfeign.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(
        name = "${client.customer.name}",
        url = "${client.customer.url}"
)
public interface CustomerClient {

    @GetMapping("/internal/customers/{id}")
    Optional<CustomerDto> findById(@PathVariable String id);
}
