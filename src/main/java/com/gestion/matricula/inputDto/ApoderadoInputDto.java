package com.gestion.matricula.inputDto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApoderadoInputDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idApoderado;
	private String apPaterno;
	private String apMaterno;
	private String nombre;
	private String nroDni;
	private String nroTelefono;
	private String codOperador;
	
	private Integer codError;
	private String msgError;
}
