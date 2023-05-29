package com.example.micpaqi.dto;
import lombok.Data;

import java.util.List;

@Data
public class CardVisualizationSettingsBar {
    private List<String> graph_dimensions; // mandatory field
    private List<String> graph_metrics; // mandatory field
    private String graph_type;
    private String graph_subtype;
    private String graph_stacking;
    private String graph_x_axis_label;
    private String graph_y_axis_label;
    private boolean graph_x_axis_show_labels;
    private boolean graph_y_axis_show_labels;
    private boolean graph_cumulative;
    private boolean graph_show_goal;
    private boolean graph_show_value_labels;
    private boolean graph_hide_legend;
    private boolean graph_show_values;
    private boolean graph_show_percentage;
    private boolean graph_show_trendline;
    private boolean graph_trendline_show_values;
    private boolean graph_reverse_y_axis;
    private boolean graph_reverse_x_axis;
    private boolean graph_enable_zoom;
    private boolean graph_is_timeseries;
    private boolean graph_x_axis_dates;
    private boolean graph_y_axis_units;
    private boolean graph_y_axis_min_zero;
    private boolean graph_x_axis_min_zero;
    private boolean graph_show_brush;
    private boolean graph_brush_opposite;
    private boolean graph_brush_show_handles;
    private boolean graph_brush_select_inverse;
    private String graph_color_palette;
    private String graph_legend_position;
    private String graph_y_axis_scale;
    private String graph_x_axis_scale;
    private String graph_brush_handle_size;
}
