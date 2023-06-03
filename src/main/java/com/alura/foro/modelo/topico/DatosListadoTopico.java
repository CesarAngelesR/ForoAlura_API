package com.alura.foro.modelo.topico;

import java.time.LocalDateTime;

import com.alura.foro.controller.TopicoController;
import com.alura.foro.modelo.curso.Curso;


public record DatosListadoTopico(String titulo, String mensaje, LocalDateTime fecha, String estatus, String autor, Curso curso) {

	public DatosListadoTopico(Topico topico) {
		this(topico.getTitulo(),topico.getMensaje(),topico.getFecha(),topico.getEstatus().toString(),topico.getAutor(),topico.getCurso());
	}

	
}
