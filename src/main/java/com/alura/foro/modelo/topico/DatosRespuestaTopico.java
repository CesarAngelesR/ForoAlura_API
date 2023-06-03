package com.alura.foro.modelo.topico;

import java.time.LocalDateTime;

import com.alura.foro.modelo.curso.Curso;


public record DatosRespuestaTopico(
		
		Long id,
		String titulo,
		String mensaje,
		LocalDateTime fechaCreacion,
		StatusTopico status,
		String autor,
		Curso curso
		) {
}
