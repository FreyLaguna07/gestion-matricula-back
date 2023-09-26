package com.gestion.matricula.util;

public enum EnumEstadoAlumno {
	REGISTRADO(0), 
	MATRICULADO(1);

    private final int value;

    private EnumEstadoAlumno(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
