package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.inputDto.UsuarioInputDto;
import com.gestion.matricula.mapper.UsuarioMapper;
import com.gestion.matricula.outputDto.ListUsuarioOutputDto;
import com.gestion.matricula.services.UsuarioService;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@Override
	@Transactional (propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000, rollbackFor =Exception.class)
	public Map<String, Object> insert(UsuarioInputDto usuarioDto) throws Exception {
		try {
			HashMap<Object, Object> insert = new HashMap<>();
			insert.put("codPerfil", usuarioDto.getCodPerfil());
			insert.put("idPerfil", usuarioDto.getCodPerfil());
			insert.put("nombre", usuarioDto.getCodPerfil());
			insert.put("apPaterno", usuarioDto.getCodPerfil());
			insert.put("apMaterno", usuarioDto.getCodPerfil());
			insert.put("nroDni", usuarioDto.getCodPerfil());
			insert.put("fchNacimiento", usuarioDto.getCodPerfil());
			insert.put("sexo", usuarioDto.getCodPerfil());
			insert.put("idApoderado", usuarioDto.getCodPerfil());
			insert.put("nroTelefono", usuarioDto.getCodPerfil());
			insert.put("tipoOperador", usuarioDto.getCodPerfil());
			insert.put("codOperador", usuarioDto.getCodPerfil());
			insert.put("correo", usuarioDto.getCodPerfil());
			insert.put("copiDni", usuarioDto.getCodPerfil());
			insert.put("copiPartidaNacimiento", usuarioDto.getCodPerfil());
			insert.put("foto", usuarioDto.getCodPerfil());
			insert.put("idCurso", usuarioDto.getIdCurso());
			usuarioMapper.insert(insert);	
			Map<String, Object> res = new HashMap<>();
			res.put("codError", insert.get("codError"));
			res.put("msgError", insert.get("msgError"));
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	public List<ListUsuarioOutputDto> list(SearchUsuarioInputDto search) throws Exception{
		try {
			Map<Object, Object> responseMap = new HashMap<>();
			responseMap.put("codPerfil",search.getCodPerfil()); 
			responseMap.put("nroDni",search.getNroDni()); 
			responseMap.put("nombre",search.getNombre()); 
			responseMap.put("apPaterno",search.getApPaterno()); 
			responseMap.put("apMaterno",search.getApMaterno()); 
			responseMap.put("fchInicio",search.getFchInicio()); 
			responseMap.put("fchFin",search.getFchFin()); 
			return usuarioMapper.list(responseMap);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	@Transactional (propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000, rollbackFor =Exception.class)
	public Map<String, Object> update(UsuarioInputDto usuarioDto) throws Exception {
		try {
			HashMap<Object, Object> update = new HashMap<>();
			update.put("idUsuario", usuarioDto.getIdUsuario());
			update.put("codPerfil", usuarioDto.getCodPerfil());
			update.put("idPerfil", usuarioDto.getCodPerfil());
			update.put("nombre", usuarioDto.getCodPerfil());
			update.put("apPaterno", usuarioDto.getCodPerfil());
			update.put("apMaterno", usuarioDto.getCodPerfil());
			update.put("nroDni", usuarioDto.getCodPerfil());
			update.put("fchNacimiento", usuarioDto.getCodPerfil());
			update.put("sexo", usuarioDto.getCodPerfil());
			update.put("idContacto", usuarioDto.getIdContacto());
			update.put("idApoderado", usuarioDto.getCodPerfil());
			update.put("nroTelefono", usuarioDto.getCodPerfil());
			update.put("tipoOperador", usuarioDto.getCodPerfil());
			update.put("codOperador", usuarioDto.getCodPerfil());
			update.put("correo", usuarioDto.getCodPerfil());
			update.put("idDetalle", usuarioDto.getIdDetalle());
			update.put("copiDni", usuarioDto.getCodPerfil());
			update.put("copiPartidaNacimiento", usuarioDto.getCodPerfil());
			update.put("foto", usuarioDto.getCodPerfil());
			update.put("idCurso", usuarioDto.getIdCurso());
			usuarioMapper.update(update);
			Map<String, Object> res = new HashMap<>();
			res.put("codError", update.get("codError"));
			res.put("msgError", update.get("msgError"));
			return res;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
		
	}
}
