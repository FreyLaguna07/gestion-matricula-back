package com.gestion.matricula.outputDto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApoderadoOutputDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idApoderado;
	private String apPaterno;
	private String apMaterno;
	private String nombre;
	private String nroDni;
	private String nroTelefono;
	private String codOperador;
}
