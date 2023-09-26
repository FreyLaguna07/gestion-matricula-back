package com.gestion.matricula.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.outputDto.ListUsuarioOutputDto;

@Mapper
public interface CursoDocenteMapper {

	public List<ListUsuarioOutputDto> list(Map<Object, Object> obj);
	
	public void insert(HashMap<Object, Object> obj);
	
}
