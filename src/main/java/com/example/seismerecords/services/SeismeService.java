package com.example.seismerecords.services;

import com.example.seismerecords.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;

public class SeismeService {

    private SeismeRepository seismeRepository;
    private ModelMapper modelMapper;

    public SeismeService(SeismeRepository seismeRepository, ModelMapper modelMapper){
        this.seismeRepository = seismeRepository;
        this.modelMapper = modelMapper;
    }



}
