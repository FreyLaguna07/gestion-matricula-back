package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.inputDto.MatriculaInputDto;
import com.gestion.matricula.mapper.MatriculaMapper;
import com.gestion.matricula.service.MatriculaSercice;

@Service("matricula")
public class MatriculaServiceImpl implements MatriculaSercice{
	
	@Autowired
	private MatriculaMapper matriculaMapper;
	
	@Override
	public Integer countAlumnoMatriculado(CursoInputDto countSearch) {
		return matriculaMapper.countAlumnoMatriculado(countSearch);
	}
	
	@Override
	public Map<Object, Object> insert(MatriculaInputDto matricula) {
		HashMap<Object, Object> insert = new HashMap<>();
		insert.put("idUsuario", matricula.getIdUsuario() != null ? matricula.getIdUsuario() : null);
		insert.put("idGrado", matricula.getIdGrado() != null ? matricula.getIdGrado() : null);
		insert.put("periodo", matricula.getPeriodo() != null ? matricula.getPeriodo() : null);
		insert.put("seccion", matricula.getSeccion() != null ? matricula.getSeccion() : null);
		matriculaMapper.insert(insert);
		Map<Object, Object> resp = new HashMap<>();
		resp.put("codError", insert.get("codError"));
		resp.put("msgError", insert.get("msgError"));
		return resp;
	}
}	
