package com.alura.foro.modelo.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DatosUsuario(

		@NotBlank
		String usuario,
		@NotBlank
		@Email
		String email,
		@NotBlank
		String contrasena) {

	}
