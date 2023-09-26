package com.gestion.matricula.inputDto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatriculaInputDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private Integer idGrado;
	private String periodo;
	private String seccion;
}
