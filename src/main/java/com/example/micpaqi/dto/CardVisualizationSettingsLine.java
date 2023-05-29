package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;

@Data
public class CardVisualizationSettingsLine {
    private List<String> graph_dimensions; // mandatory
    private List<String> graph_metrics; // mandatory
    private String graph_cumulative;
    private String graph_cumulative_function;
    private String graph_y_axis_left_format;
    private String graph_y_axis_right_format;
    private String graph_y_axis_left_min;
    private String graph_y_axis_left_max;
    private String graph_y_axis_left_units;
    private String graph_y_axis_right_min;
    private String graph_y_axis_right_max;
    private String graph_y_axis_right_units;
    private String graph_y_axis_left_label;
    private String graph_y_axis_right_label;
    private String graph_x_axis_scale;
    private String graph_x_axis_label;
    private String graph_x_axis_show_tick_labels;
    private String graph_legend_position;
    private String graph_hide_legend;
    private String graph_interpolation;
    private String graph_smoothing;
    private String graph_line_width;
    private String graph_point_style;
    private String graph_custom_theme;

}
