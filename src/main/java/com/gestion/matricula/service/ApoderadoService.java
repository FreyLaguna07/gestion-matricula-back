package com.gestion.matricula.service;

import java.util.List;
import java.util.Map;

import com.gestion.matricula.inputDto.ApoderadoInputDto;
import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.outputDto.ApoderadoOutputDto;

public interface ApoderadoService {

	public List<ApoderadoOutputDto> list(SearchUsuarioInputDto search);

	public Map<Object, Object> insert(ApoderadoInputDto dto) throws Exception;

	public Map<Object, Object> update(ApoderadoInputDto dto) throws Exception;
	
}
