package com.gestion.matricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.matricula.inputDto.ApoderadoInputDto;
import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.outputDto.ApoderadoOutputDto;
import com.gestion.matricula.service.ApoderadoService;
import com.gestion.matricula.util.ApiResponse;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/api/apoderado")
public class ApoderadoController {

	@Autowired
	ApoderadoService apoderadoService;

	@PostMapping("/list")
	public ResponseEntity<ApiResponse> list(@RequestBody SearchUsuarioInputDto search) {
		List<ApoderadoOutputDto> list = apoderadoService.list(search);
		return ResponseEntity.ok(ApiResponse.ok("Listado de apoderado", list));
	}

	@PostMapping("/insert")
	public ResponseEntity<ApiResponse> insert(@RequestBody ApoderadoInputDto dto) {
		return ResponseEntity.ok(ApiResponse.ok("Registrar apoderado", apoderadoService.insert(dto)));
	}

	@PostMapping("/update")
	public ResponseEntity<ApiResponse> update(@RequestBody ApoderadoInputDto dto) {
		return ResponseEntity.ok(ApiResponse.ok("Actualizar apoderado", apoderadoService.update(dto)));

	}
}
