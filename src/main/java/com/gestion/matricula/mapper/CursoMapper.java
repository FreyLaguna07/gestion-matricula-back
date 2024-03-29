package com.gestion.matricula.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.outputDto.CursoOutputDto;

@Mapper
public interface CursoMapper {
	
	public List<CursoOutputDto> list(CursoInputDto curso);

	public void insert(HashMap<Object, Object> obj);

	public void update(HashMap<Object, Object> obj);
}
