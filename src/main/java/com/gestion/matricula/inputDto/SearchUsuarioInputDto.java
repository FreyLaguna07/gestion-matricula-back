package com.gestion.matricula.inputDto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchUsuarioInputDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private Integer idApoderado;
	private String codPerfil;
	private String nroDni;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String fchInicio;
	private String fchFin;
	
	//alumnoMatricual
	private Integer estadoAlumno;
	private String seccion;
	private String codGrado;
	private String anio;
}
