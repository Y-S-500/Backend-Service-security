package com.sena.servicesecurity.DTO;

import java.util.List;

public interface IModuleDto {
    String getModule();
    String getNameModule();
    String getDescription();
    String getRoute();
    Long getId();
    Boolean getState();
    
    List<IViewDto> getViews();
    void setViews(List<IViewDto> views); // Método para establecer las vistas
}