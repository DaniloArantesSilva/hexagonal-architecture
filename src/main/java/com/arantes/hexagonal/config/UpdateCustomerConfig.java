package com.arantes.hexagonal.config;

import com.arantes.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.arantes.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.arantes.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.arantes.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            UpdateCustomerAdapter updateCustomerAdapter,
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findCustomerByIdAdapter
    ) {
        return new UpdateCustomerUseCase(updateCustomerAdapter, findCustomerByIdUseCase, findCustomerByIdAdapter);
    }

}
