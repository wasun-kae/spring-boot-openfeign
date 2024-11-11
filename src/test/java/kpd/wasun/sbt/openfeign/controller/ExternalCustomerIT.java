package kpd.wasun.sbt.openfeign.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.text.MessageFormat;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(
        /* Fix static port as 8080 for integration testing */
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
@AutoConfigureMockMvc
public class ExternalCustomerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_return_status_ok_with_customer_when_customer_exists_from_given_id() throws Exception {
        var existedCustomerId = "C001";
        var url = MessageFormat.format("/api/v1/customers/{0}", existedCustomerId);

        mockMvc.perform(get(url))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("""
                        {
                            "id": "C001",
                            "name": "JP"
                        }
                        """, true
                ));
    }

    @Test
    void should_return_status_not_found_when_customer_does_not_exist_from_given_id() throws Exception {
        var notExistedCustomerId = "C002";
        var url = MessageFormat.format("/api/v1/customers/{0}", notExistedCustomerId);

        mockMvc.perform(get(url))
                .andExpect(status().isNotFound());
    }
}
