package com.wine.cepwine.controller;

import com.wine.cepwine.filter.CepApi;
import com.wine.cepwine.filter.dto.CepFilter;
import com.wine.cepwine.model.Cep;
import com.wine.cepwine.service.CepService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CepController implements CepApi {

    @Autowired
    private final CepService cepService;

    @Override
    public ResponseEntity<Cep> findUniqueCep(Long id) {
        return ResponseEntity.ok(cepService.findCep(id));
    }

    @Override
    public ResponseEntity<List<Cep>> findAllCeps(CepFilter cepFilter) {
        return ResponseEntity.ok(cepService.findCeps(cepFilter));   }

    @Override
    public ResponseEntity<Cep> addCep(Cep cep) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/cep/save").toUriString());
        return ResponseEntity.created(uri).body(cepService.saveCep(cep));
    }

    @Override
    public void deleteCep(long id) {
        cepService.deleteCep(id);
    }
}
