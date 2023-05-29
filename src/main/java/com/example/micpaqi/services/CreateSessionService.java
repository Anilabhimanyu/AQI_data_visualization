package com.example.micpaqi.services;

import com.example.micpaqi.dto.SessionCreationOutputDTO;
import com.example.micpaqi.dto.SessionIdCreationInputDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CreateSessionService {
    public String sessionID() {
        System.out.println("started");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        SessionIdCreationInputDTO session_object=new SessionIdCreationInputDTO();
        session_object.setUsername("anilkumar@divum.in");
        session_object.setPassword("Metabase@3418");

        HttpEntity request=new HttpEntity(session_object,headers);

        RestTemplate restTemplate =new RestTemplate();
        SessionCreationOutputDTO response=restTemplate.postForObject("http://127.0.0.1:3000/api/session", request, SessionCreationOutputDTO.class);

        return response.getId();

    }
}
