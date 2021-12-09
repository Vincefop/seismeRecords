package com.example.seismerecords.configuration;

import com.example.seismerecords.repositories.SeismeRepository;
import com.example.seismerecords.services.SeismeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SeismeConfiguration {

    @Bean
    public SeismeService seismeService(SeismeRepository seismeRepository, ModelMapper modelMapper){
        return new SeismeService(seismeRepository, modelMapper);
    }

}
