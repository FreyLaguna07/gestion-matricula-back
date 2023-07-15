package com.gestion.matricula.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.outputDto.PerfilOutputDto;

@Mapper
public interface PerfilMapper {
	public List<PerfilOutputDto> listPerfil (Map response) throws Exception;
}
