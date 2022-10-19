package com.arantes.hexagonal.application.ports.in;

import com.arantes.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
