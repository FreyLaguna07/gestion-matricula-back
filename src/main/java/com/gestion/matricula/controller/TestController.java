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

@CrossOrigin
@RestController
@RequestMapping("/api/perfil")
public class TestController {
	
	@Autowired
	PerfilService perfilService;
	
	@GetMapping("/listPerfil")
	public ResponseEntity<?> listPerfil() {
		try {
			List<PerfilOutputDto> listResponse = perfilService.listPerfil();
			return new ResponseEntity<>(listResponse, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
