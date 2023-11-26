package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.matricula.mapper.GradoMapper;
import com.gestion.matricula.outputDto.GradoOutputDto;
import com.gestion.matricula.service.GradoService;

@Service("Grado")
public class GradoServiceIpml implements GradoService{
	
	@Autowired
	GradoMapper gradoMapper;
	
	@Override
	public List<GradoOutputDto> list(String nivelAcademico, Integer idGrado){
		if(idGrado == 0) idGrado = null;
		HashMap<Object, Object> search = new HashMap<>();
		search.put("nivel", nivelAcademico != null ? nivelAcademico : null);
		search.put("idGrado", idGrado);
		return gradoMapper.list(search);
	}
}
