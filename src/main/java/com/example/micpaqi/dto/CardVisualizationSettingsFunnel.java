package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;
@Data
public class CardVisualizationSettingsFunnel {
    private List<String> steps;
    private boolean reverse;
    private String format;
    private boolean show_percentage;
    private String percentage_format;
    private boolean show_conversion;
    private String conversion_format;

    // The following fields are mandatory
    // steps: a list of strings representing the funnel steps
    // reverse: a boolean indicating whether to reverse the funnel steps
    // format: a string specifying the format for the funnel data
    public CardVisualizationSettingsFunnel(List<String> steps, boolean reverse, String format) {
        this.steps = steps;
        this.reverse = reverse;
        this.format = format;
    }
}
