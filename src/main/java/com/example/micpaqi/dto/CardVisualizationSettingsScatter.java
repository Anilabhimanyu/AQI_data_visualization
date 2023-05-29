package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;
@Data
public class CardVisualizationSettingsScatter {
    private List<String> x_axis_column; // Mandatory
    private List<String> y_axis_columns; // Mandatory
    private List<String> series; // Mandatory
    private String series_type; // Mandatory
    private String x_axis_type;
    private String y_axis_type;
    private boolean fill_missing;
    private String point_style;
    private boolean show_data_labels;
    private boolean include_series_color;
    private boolean include_series_name;
    private boolean scatter_data_labels_enable;
    private String scatter_data_labels_type;

}
