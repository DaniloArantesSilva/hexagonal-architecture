package com.arantes.hexagonal.config;

import com.arantes.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.arantes.hexagonal.adapters.out.InsertCustomerAdapter;
import com.arantes.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.arantes.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
