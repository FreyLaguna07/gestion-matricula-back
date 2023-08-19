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
			insert.put("idPerfil", usuarioDto.getIdPerfil());
			insert.put("nombre", usuarioDto.getNombre());
			insert.put("apPaterno", usuarioDto.getApPaterno());
			insert.put("apMaterno", usuarioDto.getApMaterno());
			insert.put("nroDni", usuarioDto.getNroDni());
			insert.put("fchNacimiento", usuarioDto.getFchNacimiento());
			insert.put("sexo", usuarioDto.getSexo());
			insert.put("idApoderado", usuarioDto.getIdApoderado());
			insert.put("nroTelefono", usuarioDto.getNroTelefono());
			insert.put("tipoOperador", usuarioDto.getTipoOperador());
			insert.put("codOperador", usuarioDto.getCodOperador());
			insert.put("correo", usuarioDto.getCorreo());
			insert.put("copiDni", usuarioDto.getCopiDni());
			insert.put("copiPartidaNacimiento", usuarioDto.getCopiPartidaNacimiento());
			insert.put("foto", usuarioDto.getFoto());
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
			update.put("idPerfil", usuarioDto.getIdPerfil());
			update.put("nombre", usuarioDto.getNombre());
			update.put("apPaterno", usuarioDto.getApPaterno());
			update.put("apMaterno", usuarioDto.getApMaterno());
			update.put("nroDni", usuarioDto.getNroDni());
			update.put("fchNacimiento", usuarioDto.getFchNacimiento());
			update.put("sexo", usuarioDto.getSexo());
			update.put("idContacto", usuarioDto.getIdContacto());
			update.put("idApoderado", usuarioDto.getIdApoderado());
			update.put("nroTelefono", usuarioDto.getNroTelefono());
			update.put("tipoOperador", usuarioDto.getTipoOperador());
			update.put("codOperador", usuarioDto.getCodOperador());
			update.put("correo", usuarioDto.getCorreo());
			update.put("idDetalle", usuarioDto.getIdDetalle());
			update.put("copiDni", usuarioDto.getCopiDni());
			update.put("copiPartidaNacimiento", usuarioDto.getCopiPartidaNacimiento());
			update.put("foto", usuarioDto.getFoto());
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
