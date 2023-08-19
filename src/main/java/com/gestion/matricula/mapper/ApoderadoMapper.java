package com.gestion.matricula.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gestion.matricula.outputDto.ApoderadoOutputDto;


@Mapper
public interface ApoderadoMapper {
	public List<ApoderadoOutputDto> list(HashMap<Object, Object> obj);

	public void insert(HashMap<Object, Object> obj);

	public void update(HashMap<Object, Object> obj);
}
