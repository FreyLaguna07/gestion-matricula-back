package com.gestion.matricula.outputDto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.sql.Time;

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
	
	private Integer idCurso;
	private String nomCurso;
	private String codCurso;
	private Time horas;
	private Date fchCreacionCurso;
	private Date fchActualizacionCurso; 
	private Integer idUsuario;
	private String nomUsuario;
	private String apPaterno;
	private String apMaterno;
	private String nroDni;
	private Date fchNacimiento; 
	private String sexo;
	
	private List<HorarioOutputDto> horarios;
}
