package com.finalproject.collaborator.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

public class RoleDTO {

    @Schema(description = "The role's name", example = "ADMIN", requiredMode =
            Schema.RequiredMode.REQUIRED)
    @NotNull(message = "The role name cannot be empty")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "name='" + name + '\'' +
                '}';
    }

}
