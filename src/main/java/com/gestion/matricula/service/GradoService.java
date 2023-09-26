package com.gestion.matricula.service;

import java.util.List;

import com.gestion.matricula.outputDto.GradoOutputDto;

public interface GradoService {

	public List<GradoOutputDto> list(String nivelAcademico);
	
}
