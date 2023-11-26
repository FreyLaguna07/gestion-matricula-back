package com.gestion.matricula.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.outputDto.GradoOutputDto;
import com.gestion.matricula.outputDto.HorarioOutputDto;

@Mapper
public interface HorarioMapper {
	
	public List<HorarioOutputDto> list(Integer idCurso);
}
