package com.finalproject.salarymanagement.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class ComponentTypeDTO extends AbstractDTO {

    @Schema(description = "Component Type's name", example = "CoverFlex", requiredMode =
            Schema.RequiredMode.REQUIRED)
    @NotNull(message = "The Component Type's name cannot be null")
    private String name;

    @Schema(description = "Component Type's component Type Subtype list", requiredMode =
            Schema.RequiredMode.NOT_REQUIRED)
    private List<ComponentTypeSubtypeDTO> componentTypeSubtypes;

    public List<ComponentTypeSubtypeDTO> getComponentTypeSubtypes() {
        return componentTypeSubtypes;
    }

    public void setComponentTypeSubtypes(List<ComponentTypeSubtypeDTO> componentTypeSubtypes) {
        this.componentTypeSubtypes = componentTypeSubtypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComponentTypeDTO{" +
                "name='" + name + '\'' +
                ", componentTypeSubtypes=" + componentTypeSubtypes +
                '}';
    }
}
