package br.com.forum.api_forum.DTOs;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;

public class PostDTO {
    @NotEmpty
    @Length(min = 3, message = "O titulo deve ter no minimo 3 caracteres.")
    private String title;
    
    @NotEmpty
    @Length(min = 3, message = "A descrição deve ter no minimo 3 caracteres.")
    private String description;
}
