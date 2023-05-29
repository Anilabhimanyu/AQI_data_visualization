package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;

@Data
public class CardVisualizationSettingsGauge {
    private List<String> metric;
    private String gauge_type;
    private String gauge_units;
    private Integer gauge_min;
    private Integer gauge_max;
    private Integer gauge_goal;
    private String gauge_goal_color;
    private String gauge_custom_colors;
    private String gauge_custom_ranges;
    private String gauge_label;
    private String gauge_tooltips_enabled;
}
