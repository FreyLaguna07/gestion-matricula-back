package com.gestion.matricula.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.outputDto.ListUsuarioOutputDto;

@Mapper
public interface UsuarioMapper {

	public void insert(HashMap<Object, Object> obj);

	public List<ListUsuarioOutputDto> list(Map<Object, Object> obj);
	
	public void update(HashMap<Object, Object> obj);

}
