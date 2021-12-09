package com.example.seismerecords.services;

import com.example.seismerecords.dtos.seismeDTOs.SeismeDTO;
import com.example.seismerecords.dtos.seismeDTOs.SeismeSaveDTO;
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

    /**
     * Savegarde un seisme sur la bdd
     * @param seismeSaveDTO
     * @return le seisme Sauvé
     */
    public SeismeDTO save(SeismeSaveDTO seismeSaveDTO){
        Seisme seismeToSave = modelMapper.map(seismeSaveDTO, Seisme.class);
        Seisme seismeSaved = seismeRepository.save(seismeToSave);
        SeismeDTO seismeDTO = modelMapper.map(seismeSaved, SeismeDTO.class);
        return seismeDTO;

    }




}
