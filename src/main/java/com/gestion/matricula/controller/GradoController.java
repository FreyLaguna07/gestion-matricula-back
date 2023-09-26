package com.gestion.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.matricula.service.GradoService;
import com.gestion.matricula.util.ApiResponse;


@RestController
@CrossOrigin(value="*")
@RequestMapping("api/grado")
public class GradoController {
	
	@Autowired
	private GradoService gradoService;
	
	@GetMapping(path="/list/{nivelAcademico}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApiResponse> list(@PathVariable("nivelAcademico") String nivelAcademico){
		return ResponseEntity.ok(ApiResponse.ok("Listado de grado", gradoService.list(nivelAcademico)));
	}
}
