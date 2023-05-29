package com.example.micpaqi.controllers;

import com.example.micpaqi.apis.SessionApi;
import com.example.micpaqi.services.CreateSessionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController implements SessionApi {
    private final CreateSessionService createSessionService;
    public SessionController(CreateSessionService createSessionService){
        this.createSessionService=createSessionService;
    }
    @Override
    public String sessionApi(){
        return createSessionService.sessionID();
    }
}
