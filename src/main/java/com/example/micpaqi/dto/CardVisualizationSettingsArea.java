package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;
@Data
public class CardVisualizationSettingsArea {
    private List<String> graph_dimensions; // mandatory field
    private List<String> graph_metrics; // mandatory field
    private String graph_type;
    private String graph_stack_type;
    private boolean graph_show_values;
    private String graph_curve_type;
    private boolean graph_x_axis_labels_enabled;
    private String graph_x_axis_title_text;
    private String graph_y_axis_title_text;
    private boolean graph_y_axis_zero_based;
    private boolean graph_fill_curve;
    private boolean graph_reverse_x_axis;
    private boolean graph_reverse_y_axis;
    private String graph_y_axis_units;
    private String graph_y_axis_format;
    private boolean graph_include_series_name_in_tooltip;
    private String graph_y_axis_bounds;
    private String graph_x_axis_bounds;
}
