package com.example.micpaqi.dto;
import lombok.Data;

@Data
public class CsvUploadInputDTO {
    public String engine;
    public String name;
    public CSVDetails details;
}
