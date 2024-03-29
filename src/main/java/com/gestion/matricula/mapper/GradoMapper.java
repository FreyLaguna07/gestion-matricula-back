package com.gestion.matricula.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.outputDto.GradoOutputDto;

@Mapper
public interface GradoMapper {
	
	public List<GradoOutputDto> list(Map<Object, Object> search);
}
