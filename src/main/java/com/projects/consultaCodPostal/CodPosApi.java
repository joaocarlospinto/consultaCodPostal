package com.projects.consultaCodPostal;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CodPosApi {

    @GetMapping("/consulta/{apikey}/{cep}")
    public List<CodPosDTO> CodPostal(@PathVariable("apikey") String apikey, @PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.cttcodigopostal.pt/api/v1/" + apikey + "/" + cep;
        ResponseEntity<List<CodPosDTO>> resp =
                restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<CodPosDTO>>() {
                });
        List<CodPosDTO> codPostais = resp.getBody();
        return codPostais;
    }

}
