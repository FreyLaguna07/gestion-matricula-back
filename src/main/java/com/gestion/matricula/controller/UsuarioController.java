package com.gestion.matricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.inputDto.UsuarioInputDto;
import com.gestion.matricula.outputDto.ListUsuarioOutputDto;
import com.gestion.matricula.service.UsuarioService;
import com.gestion.matricula.util.ApiResponse;
import com.gestion.matricula.util.Constant;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/insert")
	public ResponseEntity<ApiResponse> insert(@RequestBody UsuarioInputDto usuarioDto) {
		try {
			return ResponseEntity.ok(ApiResponse.ok(Constant.MSJ_EXITO, usuarioService.insert(usuarioDto)));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(ApiResponse.ok(e.getMessage(), HttpStatus.BAD_REQUEST));
		}
	}

	@PostMapping("/list")
	public ResponseEntity<ApiResponse> list(@RequestBody SearchUsuarioInputDto search) {
		try {
			SearchUsuarioInputDto param = new SearchUsuarioInputDto();
			param.setIdUsuario(search.getIdUsuario() != null ? search.getIdUsuario() : null);
			param.setCodPerfil(search.getCodPerfil() != null ? search.getCodPerfil() : null);
			param.setNroDni(search.getNroDni() != null ? search.getNroDni() : null);
			param.setNombre(search.getNombre() != null ? search.getNombre() : null);
			param.setApPaterno(search.getApPaterno() != null ? search.getApPaterno() : null);
			param.setApMaterno(search.getApMaterno() != null ? search.getApMaterno() : null);
			param.setFchInicio(search.getFchInicio() != null ? search.getFchInicio() : null);
			param.setFchFin(search.getFchFin() != null ? search.getFchFin() : null);
			List<ListUsuarioOutputDto> resp = usuarioService.list(param);
			return ResponseEntity.ok(ApiResponse.ok(Constant.MSJ_EXITO, resp));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(ApiResponse.ok(e.getMessage(), HttpStatus.BAD_REQUEST));
		}
	}

	@PostMapping("/update")
	public ResponseEntity<ApiResponse> update(@RequestBody UsuarioInputDto usuarioDto) {
		try {
			return ResponseEntity.ok(ApiResponse.ok(Constant.MSJ_EXITO, usuarioService.update(usuarioDto)));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(ApiResponse.ok(e.getMessage(), HttpStatus.BAD_REQUEST));
		}
	}
	
	@PostMapping("/listAlumMatriula")
	public ResponseEntity<ApiResponse> listAlumMatriula(@RequestBody SearchUsuarioInputDto search) {
		try {
			SearchUsuarioInputDto param = new SearchUsuarioInputDto();
			param.setIdUsuario(search.getIdUsuario() != null ? search.getIdUsuario() : null);
			param.setCodPerfil(search.getCodPerfil() != null ? search.getCodPerfil() : null);
			param.setNroDni(search.getNroDni() != null ? search.getNroDni() : null);
			param.setNombre(search.getNombre() != null ? search.getNombre() : null);
			param.setApPaterno(search.getApPaterno() != null ? search.getApPaterno() : null);
			param.setApMaterno(search.getApMaterno() != null ? search.getApMaterno() : null);
			param.setEstadoAlumno(search.getEstadoAlumno() != null ? search.getEstadoAlumno() : null);
			param.setSeccion(search.getSeccion() != null ? search.getSeccion() : null);
			param.setCodGrado(search.getCodGrado() != null ? search.getCodGrado() : null);
			param.setAnio(search.getAnio() != null ? search.getAnio() : null);
			List<ListUsuarioOutputDto> resp = usuarioService.list(param);
			return ResponseEntity.ok(ApiResponse.ok(Constant.MSJ_EXITO, resp));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.ok(ApiResponse.ok(e.getMessage(), HttpStatus.BAD_REQUEST));
		}
	}
	
}
