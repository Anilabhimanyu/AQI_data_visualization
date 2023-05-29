package com.example.micpaqi.dto;

import lombok.Data;

@Data
public class CardVisualizationSettingsProgres {
    private String graph_size;
    private String value_column;
    private String target_value;
    private String target_column;
    private String comparison_column;
    private String comparison_value;
    private String comparison_type;
    private String value_number_format;
    private String target_number_format;
    private String comparison_number_format;
    private String title_text;
    private String subtitle_text;
    private String goal_value;
    private String goal_color;
    private String direction;
    private Boolean hide_zero_values;
    // constructors, ge
}
