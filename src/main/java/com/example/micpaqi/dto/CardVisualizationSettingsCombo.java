package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;
@Data
public class CardVisualizationSettingsCombo {
    // Mandatory fields
    private List<String> graph_dimensions;
    private List<String> graph_metrics;
    private String graph_type;

    // Optional fields
    private String graph_subtype;
    private String graph_stacking;
    private String graph_x_axis_title_text;
    private String graph_y_axis_left_title_text;
    private String graph_y_axis_right_title_text;
    private String graph_y_axis_left_tick_count;
    private String graph_y_axis_right_tick_count;
    private String graph_y_axis_min;
    private String graph_y_axis_max;
    private String graph_x_axis_labels_enabled;
    private String graph_y_axis_left_labels_enabled;
    private String graph_y_axis_right_labels_enabled;
    private String graph_x_axis_tick_count;
    private String graph_tooltips_enabled;
    private String graph_legend_position;
    private String graph_time_series_format;
}
