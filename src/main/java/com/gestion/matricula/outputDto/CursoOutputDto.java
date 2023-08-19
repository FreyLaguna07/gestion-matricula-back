package com.gestion.matricula.outputDto;

import java.io.Serializable;
import java.util.Date;
import java.util.Timer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CursoOutputDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer idCurso;
	private String nombre;
	private String codCurso;
	private String descripcion;
	private String horas;
	private Boolean estado;
	private Date fchCreacion;
	private Date fchActualizacion;
}
