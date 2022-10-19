package com.arantes.hexagonal.adapters.out;

import com.arantes.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.arantes.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.arantes.hexagonal.application.core.domain.Address;
import com.arantes.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient client;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = client.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
