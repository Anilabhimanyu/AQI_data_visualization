package com.example.micpaqi.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface CardAsImageApi {
    @GetMapping(value = "/cardasimage")
    void cardAsImage();
}
