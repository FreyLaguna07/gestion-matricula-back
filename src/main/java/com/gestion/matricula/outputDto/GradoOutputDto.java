package com.gestion.matricula.outputDto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GradoOutputDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idGrado;
	private String codGrado;
	private String nombre;
	private String nivel;
	private Boolean estado;
	private Date fchCreacion;
	private Date fchActualizacion; 
}
