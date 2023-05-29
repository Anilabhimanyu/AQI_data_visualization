package com.example.micpaqi.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface SessionApi {
    @RequestMapping(method = RequestMethod.GET,value = "/sessionId")
    String sessionApi();
}
