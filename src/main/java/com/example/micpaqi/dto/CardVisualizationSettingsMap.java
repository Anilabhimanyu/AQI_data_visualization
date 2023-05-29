package com.example.micpaqi.dto;

import lombok.Data;

import java.util.List;

@Data
public class CardVisualizationSettingsMap {
    private List<String> geojson_columns; // Mandatory field
    private List<String> latitude_columns; // Mandatory field
    private List<String> longitude_columns; // Mandatory field
    private List<String> metric_columns; // Mandatory field
    private String marker_size_column;
    private String marker_color_column;
    private String marker_icon;
    private String zoom_level;
    private String cluster_radius;
    private boolean show_data_labels;
    private boolean show_legend;
    private boolean enable_clustering;
    private boolean zoom_to_layer;
    private boolean auto_zoom;
    private boolean use_metric_color;
}
