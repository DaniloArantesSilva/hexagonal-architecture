package com.arantes.hexagonal.application.ports.out;

import com.arantes.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(final String id);

}
