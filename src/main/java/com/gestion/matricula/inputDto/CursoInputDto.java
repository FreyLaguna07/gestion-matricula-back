package com.gestion.matricula.inputDto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Timer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CursoInputDto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer idCurso;
	private String nombre;
	private String codCurso;
	private String descripcion;
	private Time horas;
	private String nivelAcademico;
	private String codGrado;
	
	//seccion
	private String seccion;
}
