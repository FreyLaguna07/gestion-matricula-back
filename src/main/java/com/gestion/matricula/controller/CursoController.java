package com.gestion.matricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.outputDto.CursoOutputDto;
import com.gestion.matricula.services.CursoService;
import com.gestion.matricula.util.ApiResponse;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/curso")
public class CursoController {

	@Autowired
	CursoService cursoService;

	@GetMapping("/list/{idCurso}")
	public ResponseEntity<ApiResponse> list(@PathVariable Integer idCurso) {
		return ResponseEntity.ok(ApiResponse.ok("Listado de apoderado", cursoService.list(idCurso)));
	}

	@PostMapping("/insert")
	public ResponseEntity<ApiResponse> insert(@RequestBody CursoInputDto dto) {
		return ResponseEntity.ok(ApiResponse.ok("Registrar apoderado", cursoService.insert(dto)));
	}

	@PostMapping("/update")
	public ResponseEntity<ApiResponse> update(@RequestBody CursoInputDto dto) {
		return ResponseEntity.ok(ApiResponse.ok("Actualizar apoderado", cursoService.update(dto)));

	}
}
