package com.gestion.matricula.outputDto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListUsuarioOutputDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idUsuario;
	private String nomUsuario;
	private String apPaternoUsuario;
	private String apMaternoUsuario;
	private String nroDniUsuario;
	private String fchNacimeintoUsuario;
	private String sexo;
	private Integer idPerfil;
	private String tipousuario;
	
	private String codPerfil;
	private String detalle;
	private Integer idDetalle;
	private String copiDni;
	private String copiPartidaNacimiento;
	private String foto;
	private Integer idContacto;
	private String nroTelefono;
	private String tipoOperador;
	private String codOperador;
	private String correo;
	private Integer idApoderado;
	private String nomApoderado;
	private String apPaternoApoderado;
	private String apMaternoApoderado;
	private String nroDniApoderado;
	private String telefonoApooderado;
	private String codOperadorApoderado;
	private String direccion;
}
