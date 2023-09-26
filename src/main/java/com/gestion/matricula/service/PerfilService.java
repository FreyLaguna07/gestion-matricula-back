package com.gestion.matricula.service;

import java.util.List;

import com.gestion.matricula.outputDto.PerfilOutputDto;

public interface PerfilService {
	public List<PerfilOutputDto> list() throws Exception;
}
