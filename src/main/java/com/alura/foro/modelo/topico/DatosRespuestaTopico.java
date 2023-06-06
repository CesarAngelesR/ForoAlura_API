package com.alura.foro.modelo.topico;

import java.time.LocalDate;

import com.alura.foro.modelo.curso.Curso;


public record DatosRespuestaTopico(
		
		Long id,
		String titulo,
		String mensaje,
		LocalDate fecha,
		StatusTopico status,
		String autor,
		Curso curso
		) {

}
