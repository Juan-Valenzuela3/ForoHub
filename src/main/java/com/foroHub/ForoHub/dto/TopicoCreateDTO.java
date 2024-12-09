package com.foroHub.ForoHub.dto;

public record TopicoCreateDTO(
        String titulo,
        String mensaje,
        String status,
        String autor,
        String curso
) {}
