package com.gestion.matricula.inputDto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioInputDto implements Serializable{

	private static final long serialVersionUID = 1L;
	//datos usuario
	private String codPerfil;
	private Integer idPerfil;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String nroDni;
	private String fchNacimiento;
	private String sexo;
	//datos apoderado 
	private Integer idApoderado;
	//datos contacto
	private String nroTelefono;
	private String tipoOperador;
	private String codOperador;
	private String correo;
	//detalle usuario
	private String copiDni;
	private String copiPartidaNacimiento;
	private String foto;
	
	//param update
	private Integer idUsuario;
	private Integer idContacto;
	private Integer idDetalle;
	private String direccion;
	private Integer idCurso;
	private Integer codError;
	private String msgError;
	
}
