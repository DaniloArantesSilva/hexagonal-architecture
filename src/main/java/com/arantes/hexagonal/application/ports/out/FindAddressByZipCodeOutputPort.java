package com.arantes.hexagonal.application.ports.out;

import com.arantes.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);

}
