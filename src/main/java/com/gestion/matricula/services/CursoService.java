package com.gestion.matricula.services;

import java.util.List;
import java.util.Map;

import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.outputDto.CursoOutputDto;

public interface CursoService {

	public List<CursoOutputDto> list(Integer idCurso);

	public Map<Object, Object> insert(CursoInputDto dto);

	public Map<Object, Object> update(CursoInputDto dto);
	
}
