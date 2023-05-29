package com.example.micpaqi.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface SampleApi {
    @GetMapping(value = "/sample")
    void sample();
}
