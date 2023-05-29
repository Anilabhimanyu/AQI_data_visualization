package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;
@Data
public class CardVisualizationSettingsPie {
    private List<String> dimensions; // mandatory field
    private String metric; // mandatory field
    private boolean donut;
    private int donut_ratio;
    private boolean show_labels;
    private boolean show_legend;
    private String number_format;
}
