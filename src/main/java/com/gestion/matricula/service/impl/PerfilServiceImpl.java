package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.matricula.mapper.PerfilMapper;
import com.gestion.matricula.outputDto.PerfilOutputDto;
import com.gestion.matricula.services.PerfilService;
import com.gestion.matricula.util.Constant;

@Service("Perfil")
public class PerfilServiceImpl implements PerfilService {
	@Autowired
	PerfilMapper perfilMapper;
	
	@Override
	public List<PerfilOutputDto> list() throws Exception{
		try {
			Map responseMap = new HashMap<>();
			return perfilMapper.list(responseMap);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(Constant.MSJ_ERROR);
		}
	}
}
