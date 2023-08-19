package com.gestion.matricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.matricula.outputDto.PerfilOutputDto;
import com.gestion.matricula.services.PerfilService;
import com.gestion.matricula.util.ApiResponse;

@CrossOrigin
@RestController
@RequestMapping("/api/perfil")
public class PerfilController {
	
	@Autowired
	PerfilService perfilService;
	
	@GetMapping("/list")
	public ResponseEntity<ApiResponse> list() {
		try {
			List<PerfilOutputDto> listResponse = perfilService.list();
			return ResponseEntity.ok(ApiResponse.ok("Listado de perfiles", listResponse));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(ApiResponse.ok(e.getMessage(), HttpStatus.BAD_REQUEST));
		}
	}
}
