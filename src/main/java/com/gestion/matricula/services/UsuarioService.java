package com.gestion.matricula.services;

import java.util.List;
import java.util.Map;

import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.inputDto.UsuarioInputDto;
import com.gestion.matricula.outputDto.ListUsuarioOutputDto;

public interface UsuarioService {

	public List<ListUsuarioOutputDto> list(SearchUsuarioInputDto search) throws Exception;

	public Map<String, Object> update(UsuarioInputDto usuarioDto) throws Exception;

	public Map<String, Object> insert(UsuarioInputDto usuarioDto) throws Exception;

}
