package com.gestion.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.inputDto.MatriculaInputDto;
import com.gestion.matricula.service.MatriculaSercice;
import com.gestion.matricula.util.ApiResponse;

@RestController
@CrossOrigin(value="*")
@RequestMapping("/api/matricula")
public class MatriculaController {
	
	@Autowired
	private MatriculaSercice matriculaSercice;
	
	@PostMapping(path="/countAlumnoMatriculado", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApiResponse> countAlumnoMatriculado(@RequestBody CursoInputDto countSearch){
		return ResponseEntity.ok(ApiResponse.ok("Cantidad de alumnos matriculados", matriculaSercice.countAlumnoMatriculado(countSearch)));
	}
	
	@PostMapping(path="/insert", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ApiResponse> insert(@RequestBody MatriculaInputDto matricula) throws Exception{
		return ResponseEntity.ok(ApiResponse.ok("Registro de matricula", matriculaSercice.insert(matricula)));
	}
	
}
