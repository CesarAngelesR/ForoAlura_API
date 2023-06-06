package com.alura.foro.modelo.topico;

import java.time.LocalDate;

import com.alura.foro.modelo.curso.Curso;


import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, LocalDate fecha, StatusTopico status, String autor, Curso curso) {

}
