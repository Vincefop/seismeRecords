package com.example.seismerecords.services;

import com.example.seismerecords.dtos.SeismeDTO;
import com.example.seismerecords.entities.Seisme;
import com.example.seismerecords.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class SeismeService {

    private SeismeRepository seismeRepository;
    private ModelMapper modelMapper;

    public SeismeService(SeismeRepository seismeRepository, ModelMapper modelMapper){
        this.seismeRepository = seismeRepository;
        this.modelMapper = modelMapper;
    }


    /**
     * Enregistre les séismes présents sur la BDD dans une liste, les transforment en DTO
     * @return une liste de SeismeDTO
     */
    public List<SeismeDTO> findAll(){
        List<SeismeDTO> seismeDTOS = new ArrayList<>();
        List<Seisme> seismes = seismeRepository.findAll();
        seismes.forEach(seisme -> {
            seismeDTOS.add(modelMapper.map(seisme, SeismeDTO.class));
        });
        return seismeDTOS;
    }




}
