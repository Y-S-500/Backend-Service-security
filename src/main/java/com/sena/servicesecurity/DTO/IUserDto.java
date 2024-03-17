package com.sena.servicesecurity.DTO;

import java.util.List;
public interface IUserDto extends IGenericDto {
    Long getId();
    String getUsername();
    String getPersonName();
    String getPersonEmail();
    Long getRoleId();
    Boolean getState();
  
    List<IModuleDto> getModuls();
    void setModuls(List<IModuleDto> moduls); // Método para establecer los módulos
}
