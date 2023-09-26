package com.gestion.matricula.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.outputDto.GradoOutputDto;

@Mapper
public interface GradoMapper {
	
	public List<GradoOutputDto> list(String nivelAcademico);
}
