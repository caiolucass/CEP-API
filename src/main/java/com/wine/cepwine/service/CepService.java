package com.wine.cepwine.service;

import com.wine.cepwine.filter.dto.CepFilter;
import com.wine.cepwine.model.Cep;
import com.wine.cepwine.repo.CepRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CepService {
    @Autowired
    private CepRepository cepRepository;

    public Cep findCep(long id){
        return cepRepository.findById(id).get();
    }

    public List<Cep> findCeps(CepFilter cepFilter) {
        if (cepFilter.getCodigo_loja() == null) {
            return cepRepository.findByCodigoLoja(cepFilter.getCodigo_loja());
        }
        return cepRepository.findCepByFaixaInicioAndFaixaFim(cepFilter.getFaixa_inicio(), cepFilter.getFaixa_fim());
    }

    public Cep saveCep(Cep cep) {
        log.info("Salvando novo CEP {} no banco de dados.", cep.getFaixa_inicio());
        Optional<Cep> cepList = cepRepository.findCepByFaixaInicio(cep.getFaixa_inicio());

        if(cepList.isPresent()){
            throw new IllegalStateException("Faixa de CEP ja cadastrada!");
        }
        return cepRepository.save(cep);
    }

    public void deleteCep(long id) {
        cepRepository.deleteById(id);
    }

}
