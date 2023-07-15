package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.matricula.mapper.PerfilMapper;
import com.gestion.matricula.outputDto.PerfilOutputDto;
import com.gestion.matricula.services.PerfilService;

@Service("Perfil")
public class PerfilServiceImpl implements PerfilService {
	@Autowired
	PerfilMapper perfilMapper;
	
	@Override
	public List<PerfilOutputDto> listPerfil() throws Exception{
		try {
			Map responseMap = new HashMap<>();
			
			//System.out.println("response"+listComboMapper.listComboArea(responseMap));
			
			return perfilMapper.listPerfil(responseMap);
		} catch (Exception e) {
			e.printStackTrace();
			//throw new Exception(Constant.MSJ_ERROR);
			throw new Exception("error");
		}
	}
}
