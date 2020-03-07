package com.emanuelcmesquita.dev.web.rest;

import com.emanuelcmesquita.dev.domain.Festa;
import com.emanuelcmesquita.dev.repository.FestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FestaRest {

    @Autowired
    private FestaRepository festaRepository;

    @GetMapping("/festa")
    public List<Festa> getFestas(){
        return festaRepository.findAll();
    }

    @PostMapping("/festa")
    public Festa salvar(@RequestBody @Valid Festa festa){
        //return festaRepository.save(festa);
        festa = festaRepository.save(festa);
        return festa;
    }

}
