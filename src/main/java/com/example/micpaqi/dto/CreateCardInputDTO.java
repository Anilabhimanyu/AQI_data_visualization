package com.example.micpaqi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class CreateCardInputDTO {
        private String name;
        private String dataset_query;
        private String description;
        private String display;
        private List<String> visualization_settings;
//        public CreateCardDTO(String name, String dataset_query, String description, String display, List<String> visualization_settings) {
//            this.name = name;
//            this.dataset_query = dataset_query;
//            this.description = description;
//            this.display = display;
//            this.visualization_settings = visualization_settings;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getDataset_query() {
//            return dataset_query;
//        }
//
//        public void setDataset_query(String dataset_query) {
//            this.dataset_query = dataset_query;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//
//        public String getDisplay() {
//            return display;
//        }
//
//        public void setDisplay(String display) {
//            this.display = display;
//        }
//
//        public List<String> getVisualization_settings() {
//            return visualization_settings;
//        }
//
//        public void setVisualization_settings(List<String> visualization_settings) {
//            this.visualization_settings = visualization_settings;
//        }
    }


