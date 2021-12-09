package com.example.seismerecords.Controllers;

import com.example.seismerecords.dtos.SeismeDTO;
import com.example.seismerecords.services.SeismeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seismes")
public class SeismeController {

    private SeismeService seismeService;

    public SeismeController(SeismeService seismeService){
        this.seismeService = seismeService;
    }

    @GetMapping
    public List<SeismeDTO> findAll(){
        return seismeService.findAll();
    }
}
