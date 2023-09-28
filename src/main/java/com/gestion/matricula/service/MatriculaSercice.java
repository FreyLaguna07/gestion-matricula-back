package com.gestion.matricula.service;

import java.util.Map;

import com.gestion.matricula.inputDto.CursoInputDto;
import com.gestion.matricula.inputDto.MatriculaInputDto;

public interface MatriculaSercice {

	public Integer countAlumnoMatriculado(CursoInputDto countSearch);

	public Map<Object, Object> insert(MatriculaInputDto matricula) throws Exception;

}
