package com.example.micpaqi.apis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
public interface UploadCsvApi {
    @PostMapping(value = "/uploadCsv")
    ResponseEntity<Map<String, Object>> uploadCsvApi(@RequestParam("csv-file") MultipartFile csvFile);
}
