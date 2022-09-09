package com.wine.cepwine.Rest.map;

import com.wine.cepwine.model.Cep;
import com.wine.cepwine.model.dto.CepResponse;
import org.springframework.stereotype.Component;

@Component
public class CepMapObject {

    //Mapear o Objeto JSON
    public Cep CepMap(CepResponse cepResponse) {

        Cep cep = new Cep();
        cepResponse.setCodigo_loja(cepResponse.getCodigo_loja());
        cepResponse.setFaixa_inicio(cepResponse.getFaixa_inicio());
        cepResponse.setFaixa_fim(cepResponse.getFaixa_fim());

        return cep;
    }
}
