package com.alura.foro.modelo.topico;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.alura.foro.modelo.curso.Curso;


public record DatosListadoTopico(
		Long Id,
		String titulo, 
		String mensaje, 
		LocalDate fecha, 
		String estatus, 
		String autor, 
		Curso curso
		) {
	
	 public DatosListadoTopico(Topico topico) {
	        this(topico.getId(), topico.getTitulo(), topico.getMensaje().toString(), topico.getFecha(), topico.getEstatus().toString(), topico.getAutor(), topico.getCurso());
	    }
	
}
