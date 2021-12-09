package com.example.seismerecords.Controllers;

import com.example.seismerecords.dtos.seismeDTOs.SeismeDTO;
import com.example.seismerecords.dtos.seismeDTOs.SeismeSaveDTO;
import com.example.seismerecords.services.SeismeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public SeismeDTO save(@RequestBody SeismeSaveDTO seismeSaveDTO){
        return seismeService.save(seismeSaveDTO);
    }
}
