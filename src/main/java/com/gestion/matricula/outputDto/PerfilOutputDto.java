package com.gestion.matricula.outputDto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilOutputDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idPerfil;
	private String codPerfil;
	private String nombre;
	private String detalle;
	private Boolean estado;
	private Date fchCreacion;
	private Date fchActualizacion;
}
