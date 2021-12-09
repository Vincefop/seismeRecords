package com.example.seismerecords.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
public class UtilConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
