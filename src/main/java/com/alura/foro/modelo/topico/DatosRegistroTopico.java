package com.alura.foro.modelo.topico;


import com.alura.foro.modelo.curso.Curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
		
		  @NotBlank
	      String titulo,
	      @NotBlank
	      String mensaje,      
	      @NotNull
	      String autor,
	      @NotNull
	      Curso curso) {
	}
