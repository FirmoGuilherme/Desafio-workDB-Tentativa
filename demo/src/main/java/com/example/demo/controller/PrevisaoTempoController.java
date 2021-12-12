package com.example.demo.controller;

import com.example.demo.entity.JSONResponse;
import com.example.demo.entity.PrevisaoTempo;
import com.example.demo.repository.PrevisaoTempoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class PrevisaoTempoController {

    @Autowired
    private PrevisaoTempoRepository repository;

    @GetMapping(path = "/previsao")
    public List<PrevisaoTempo> listarTudo() throws IOException {

        return repository.findAll();
    }

    @GetMapping(path = "/api")
    public void api() throws IOException {
        ConectOpenWeatherAPI.retornaAPI();
    }

    @PostMapping(path = "/previsao")
    public PrevisaoTempo salvar(@RequestBody PrevisaoTempo previsaoTempo) {
        Date date=java.util.Calendar.getInstance().getTime();
        previsaoTempo.setDia(date);
        return repository.save(previsaoTempo);
    }
}
