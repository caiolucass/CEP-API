package com.wine.cepwine.filter;

import com.wine.cepwine.filter.dto.CepFilter;
import com.wine.cepwine.model.Cep;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.SpringQueryMap;

import java.util.List;
import javax.validation.Valid;

@RequestMapping(value= "/api/cep")
@CrossOrigin(origins = "*")
public interface CepApi {

    @GetMapping(value = "/{cep}")
    public ResponseEntity<Cep> findUniqueCep(@PathVariable("cep") final Long id );

    @GetMapping(value = "/ceps")
    public ResponseEntity<List<Cep>> findAllCeps(@SpringQueryMap @Valid final CepFilter cepFilter);

    @PostMapping(value = "/cadastrarCep")
    public ResponseEntity<Cep> addCep(@RequestBody @Valid final Cep cep);

    @DeleteMapping(value = "/deletarCep")
    public void deleteCep(@PathVariable("cep") final long id);
}
