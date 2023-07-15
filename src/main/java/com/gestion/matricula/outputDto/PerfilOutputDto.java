package com.gestion.matricula.outputDto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilOutputDto {
	Integer idPerfil;
	String nombre;
	String detalle;
	Boolean estado;
	Date fchCreacion;
	Date fchActualizacion;
}
