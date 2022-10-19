package com.arantes.hexagonal.application.ports.in;

import com.arantes.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
