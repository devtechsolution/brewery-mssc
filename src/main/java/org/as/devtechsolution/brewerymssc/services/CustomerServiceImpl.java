package org.as.devtechsolution.brewerymssc.services;

import lombok.extern.slf4j.Slf4j;
import org.as.devtechsolution.brewerymssc.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById (UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Aditya Srivastva")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl
        log.debug("Updating....");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting.... ");
    }
}
