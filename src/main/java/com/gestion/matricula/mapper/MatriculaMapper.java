package com.gestion.matricula.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.inputDto.MatriculaInputDto;

@Mapper
public interface MatriculaMapper {
	
	public Integer countAlumnoMatriculado(CursoInputDto countSearch);
	
	public void insert(HashMap<Object, Object> obj);
}	
