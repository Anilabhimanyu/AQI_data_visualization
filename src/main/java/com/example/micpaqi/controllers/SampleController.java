package com.example.micpaqi.controllers;

import com.example.micpaqi.apis.SampleApi;
import com.example.micpaqi.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController implements SampleApi {
    private final SampleService sampleService;
    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }
    @Override
    public void sample() {
        sampleService.sample();
    }
}
