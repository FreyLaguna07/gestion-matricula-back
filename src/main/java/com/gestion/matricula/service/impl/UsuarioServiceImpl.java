package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.inputDto.UsuarioInputDto;
import com.gestion.matricula.mapper.CursoDocenteMapper;
import com.gestion.matricula.mapper.UsuarioMapper;
import com.gestion.matricula.outputDto.ListUsuarioOutputDto;
import com.gestion.matricula.service.UsuarioService;
import com.gestion.matricula.util.EnumEstadoAlumno;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@Autowired
	private CursoDocenteMapper cursoDocenteMapper;
	
	@Override
	@Transactional (propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000, rollbackFor =Exception.class)
	public Map<String, Object> insert(UsuarioInputDto usuarioDto) throws Exception {
		Boolean isAdmin = false;
		try {
			if(usuarioDto.getCodPerfil().equals("01")) isAdmin = true;
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
			insert.put("direccion", usuarioDto.getDireccion());
			insert.put("certEstudio", usuarioDto.getCertEstudio());
			insert.put("estadoAlumno", usuarioDto.getEstadoAlumno() == null ? EnumEstadoAlumno.MATRICULADO.getValue() : null);
			usuarioMapper.insert(insert);	
			Map<String, Object> res = new HashMap<>();
			res.put("codError", insert.get("codError"));
			res.put("msgError", insert.get("msgError"));
			
			Map<String, Object> resp = new HashMap<>();
			if ((Integer) res.get("codError") != 0 && usuarioDto.getIdCursos() != null) {
				HashMap<Object, Object> insertCursoApoderado = new HashMap<>();
				usuarioDto.getIdCursos().stream().forEach(e -> {
					insertCursoApoderado.put("idCurso", e);
					insertCursoApoderado.put("idusuario", res.get("codError"));
					cursoDocenteMapper.insert(insertCursoApoderado);	
				});
				resp.put("codError", insertCursoApoderado.get("codError"));
				resp.put("msgError", insertCursoApoderado.get("msgError"));
			}
			return isAdmin ? res : resp;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	public List<ListUsuarioOutputDto> list(SearchUsuarioInputDto search) throws Exception{
		try {
			Map<Object, Object> requestMap = new HashMap<>();
			requestMap.put("idUsuario",search.getIdUsuario()); 
			requestMap.put("codPerfil",search.getCodPerfil()); 
			requestMap.put("nroDni",search.getNroDni()); 
			requestMap.put("nombre",search.getNombre()); 
			requestMap.put("apPaterno",search.getApPaterno()); 
			requestMap.put("apMaterno",search.getApMaterno()); 
			requestMap.put("fchInicio",search.getFchInicio()); 
			requestMap.put("fchFin",search.getFchFin()); 
			requestMap.put("estadoAlumno",search.getEstadoAlumno()); 
			List<ListUsuarioOutputDto> listCursoDocente = cursoDocenteMapper.list(requestMap);
			List<Integer> idList = listCursoDocente.stream().map(x -> x.getIdCurso()).collect(Collectors.toList());
			List<ListUsuarioOutputDto> listUsuario = usuarioMapper.list(requestMap);
			listUsuario.stream().forEach(e -> {
				e.setIdCursos(idList);
			});
			
			return listUsuario;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	@Override
	@Transactional (propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000, rollbackFor =Exception.class)
	public Map<String, Object> update(UsuarioInputDto usuarioDto) throws Exception {
		Boolean isAdmin = false;
		try {
			if(usuarioDto.getCodPerfil().equals(usuarioDto.getCodPerfil())) isAdmin = true;
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
			update.put("direccion", usuarioDto.getDireccion());
			update.put("certEstudio", usuarioDto.getCertEstudio());
			update.put("idCurso", usuarioDto.getIdCurso());
			update.put("estadoAlumno", usuarioDto.getEstadoAlumno());
			usuarioMapper.update(update);
			Map<String, Object> res = new HashMap<>();
			res.put("codError", update.get("codError"));
			res.put("msgError", update.get("msgError"));
			Map<String, Object> resp = new HashMap<>();
			if ((Integer) res.get("codError") != 0 && usuarioDto.getIdCursos() != null) {
				HashMap<Object, Object> updateCursoApoderado = new HashMap<>();
				usuarioDto.getIdCursos().stream().forEach(e -> {
					updateCursoApoderado.put("idCurso", e);
					updateCursoApoderado.put("idUsuario", usuarioDto.getIdUsuario());
					cursoDocenteMapper.insert(updateCursoApoderado);
				});
				resp.put("codError", updateCursoApoderado.get("codError"));
				resp.put("msgError", updateCursoApoderado.get("msgError"));
			}
			return isAdmin ? res : resp;
		} catch (Exception e) {
			throw new Exception (e.getMessage());
		}
	}	
	
	@Override
	public List<ListUsuarioOutputDto> listAlumMatriula(SearchUsuarioInputDto search) throws Exception{
		try {
			Map<Object, Object> requestMap = new HashMap<>();
			requestMap.put("idUsuario",search.getIdUsuario() != null ? search.getIdUsuario() : null); 
			requestMap.put("codPerfil",search.getCodPerfil() != null ? search.getCodPerfil() : null); 
			requestMap.put("nroDni",search.getNroDni() != null ? search.getNroDni() : null); 
			requestMap.put("nombre",search.getNombre() != null ? search.getNombre() : null); 
			requestMap.put("apPaterno",search.getApPaterno() != null ? search.getApPaterno() : null); 
			requestMap.put("apMaterno",search.getApMaterno() != null ? search.getApMaterno() : null); 
			requestMap.put("estadoAlumno",search.getEstadoAlumno() != null ? search.getEstadoAlumno() : null); 
			requestMap.put("seccion",search.getSeccion() != null ? search.getSeccion() : null); 
			requestMap.put("idGrado",search.getIdGrado() != null ? search.getIdGrado() : null); 
			requestMap.put("anio",search.getAnio() != null ? search.getAnio() : null); 
			List<ListUsuarioOutputDto> listCursoDocente = cursoDocenteMapper.list(requestMap);
			List<Integer> idList = listCursoDocente.stream().map(x -> x.getIdCurso()).collect(Collectors.toList());
			List<ListUsuarioOutputDto> listUsuario = usuarioMapper.listAlumMatriula(requestMap);
			listUsuario.stream().forEach(e -> {
				e.setIdCursos(idList);
			});
			
			return listUsuario;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
