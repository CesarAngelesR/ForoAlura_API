package com.alura.foro.modelo.topico;

import java.time.LocalDate;

import com.alura.foro.modelo.curso.Curso;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String mensaje;
	private LocalDate fecha = LocalDate.now();
	@Enumerated(EnumType.STRING)
	private StatusTopico estatus = StatusTopico.NO_RESPONDIDO;
	private String autor;
	@Enumerated(EnumType.STRING)
	private Curso curso;

	public Topico(String titulo, String mensaje, Curso curso) {
		this.titulo = titulo;
		this.mensaje = mensaje;
		this.curso = curso;
	}
	
	public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
		
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
	    if (datosActualizarTopico.mensaje() != null) {
	        this.mensaje = datosActualizarTopico.mensaje();
 	    }
	    if (datosActualizarTopico.fecha() != null) {
	        this.fecha = datosActualizarTopico.fecha();
 	    }
	    if (datosActualizarTopico.status() != null) {
	    	this.estatus = datosActualizarTopico.status();
	    }
	    if (datosActualizarTopico.autor() != null) {
	    	this.autor = datosActualizarTopico.autor();
	    }
	    if (datosActualizarTopico.curso() != null) {
	    	this.curso = datosActualizarTopico.curso();
	    }
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Topico other = (Topico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.autor=datosRegistroTopico.autor();
        this.curso=datosRegistroTopico.curso();
	}
	

}

