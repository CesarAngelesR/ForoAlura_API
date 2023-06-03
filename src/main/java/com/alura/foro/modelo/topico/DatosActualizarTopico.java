package com.alura.foro.modelo.topico;

import java.time.LocalDateTime;

import com.alura.foro.modelo.curso.Curso;
import com.alura.foro.modelo.topico.StatusTopico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, LocalDateTime fechaCreacion, StatusTopico status, String autor, Curso curso) {

}
