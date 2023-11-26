package com.gestion.matricula.outputDto;

import java.io.Serializable;
import java.sql.Time;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HorarioOutputDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer idCurso;
	private Integer idHorario;
	private String dia;
	private Time horaInicio;
	private Time horaFin;
}
