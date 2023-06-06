package com.alura.foro.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.foro.modelo.topico.DatosActualizarTopico;
import com.alura.foro.modelo.topico.DatosListadoTopico;
import com.alura.foro.modelo.topico.DatosRegistroTopico;
import com.alura.foro.modelo.topico.DatosRespuestaTopico;
import com.alura.foro.modelo.topico.Topico;
import com.alura.foro.modelo.topico.TopicoRepository;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController {

	@Autowired
	private TopicoRepository topicoRepository;

	@PostMapping
	public ResponseEntity<DatosRespuestaTopico> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico,
    UriComponentsBuilder uriComponentsBuilder) {
		 Topico topico = topicoRepository.save(new Topico(datosRegistroTopico));
	        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
					topico.getFecha(),topico.getEstatus(),topico.getAutor(), topico.getCurso());

	        URI url = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
	        return ResponseEntity.created(url).body(datosRespuestaTopico);
	}

	@GetMapping
	public ResponseEntity<Page<Object>> listadoTopicos(@PageableDefault(size = 6) Pageable paginacion) {
		return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(DatosListadoTopico::new));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DatosRespuestaTopico> retornaDatosTopico(@PathVariable Long id) {
		Topico topico = topicoRepository.getReferenceById(id);
		var datosTopico = new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
				topico.getFecha(), topico.getEstatus(), topico.getAutor(), topico.getCurso());
		return ResponseEntity.ok(datosTopico);
	}

	@PutMapping
	@Transactional
	public ResponseEntity<DatosRespuestaTopico> actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
		Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
		topico.actualizarDatos(datosActualizarTopico);
		return ResponseEntity.ok(new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
				topico.getFecha(), topico.getEstatus(), topico.getAutor(), topico.getCurso()));
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void eliminarTopico(@PathVariable long id) {
		Topico topico = topicoRepository.getReferenceById(id);
		topicoRepository.delete(topico);
	}
}

