package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.matricula.inputDto.ApoderadoInputDto;
import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.mapper.ApoderadoMapper;
import com.gestion.matricula.mapper.CursoMapper;
import com.gestion.matricula.outputDto.ApoderadoOutputDto;
import com.gestion.matricula.outputDto.CursoOutputDto;
import com.gestion.matricula.services.ApoderadoService;
import com.gestion.matricula.services.CursoService;

@Service("Curso")
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoMapper cursoMapper;
	
	@Override
	public List<CursoOutputDto> list(Integer idCurso){
		if(idCurso == 0) idCurso = null;
		return cursoMapper.list(idCurso);
	}
	
	@Override 
	public Map<Object, Object> insert(CursoInputDto dto) {
		HashMap<Object, Object> insert = new HashMap<>();
		insert.put("nombre", dto.getNombre());
		insert.put("codCurso", dto.getCodCurso());
		insert.put("descripcion", dto.getDescripcion());
		insert.put("horas", dto.getHoras());
		cursoMapper.insert(insert);
		Map<Object, Object> resp = new HashMap<>();
		resp.put("codError", insert.get("codError"));
		resp.put("msgError", insert.get("msgError"));
		return resp;
	}
	
	@Override
	public Map<Object, Object> update(CursoInputDto dto) {
		HashMap<Object, Object> update = new HashMap<>();
		update.put("idCurso", dto.getIdCurso());
		update.put("nombre", dto.getNombre());
		update.put("codCurso", dto.getCodCurso());
		update.put("descripcion", dto.getDescripcion());
		update.put("horas", dto.getHoras());
		cursoMapper.update(update);
		Map<Object, Object> resp = new HashMap<>();
		resp.put("codError", update.get("codError"));
		resp.put("msgError", update.get("msgError"));
		return resp;
	}
}
