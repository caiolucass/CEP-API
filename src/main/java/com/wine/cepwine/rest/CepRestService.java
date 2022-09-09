package com.wine.cepwine.rest;

import com.wine.cepwine.model.dto.CepResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CepRestService {

    private String cep_base_url ;

    private String cep_type_format ;

    public CepResponse findCep(String cep){
        String uri = cep_base_url.concat(cep).concat(cep_type_format);
        return restTemplate().getForObject(uri, CepResponse.class);
    }

    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
