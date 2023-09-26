package com.gestion.matricula.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.matricula.inputDto.ApoderadoInputDto;
import com.gestion.matricula.inputDto.SearchUsuarioInputDto;
import com.gestion.matricula.mapper.ApoderadoMapper;
import com.gestion.matricula.outputDto.ApoderadoOutputDto;
import com.gestion.matricula.service.ApoderadoService;

@Service("Apoderado")
public class ApoderadoServiceImpl implements ApoderadoService{

	@Autowired
	private ApoderadoMapper apoderadoMapper;
	
	@Override
	public List<ApoderadoOutputDto> list(SearchUsuarioInputDto search){
		HashMap<Object, Object> dto = new HashMap<>();
		dto.put("idApoderado", search.getIdApoderado()!= null ? search.getIdApoderado() : null);
		dto.put("nroDni", search.getNroDni() != null ? search.getNroDni() : null);
		dto.put("nombre", search.getNombre() != null ? search.getNombre(): null);
		dto.put("apPaterno", search.getApPaterno() != null ? search.getApPaterno() : null);
		dto.put("apMaterno", search.getApMaterno() != null ? search.getApMaterno() : null);
		return apoderadoMapper.list(dto);
	}
	
	@Override 
	public Map<Object, Object> insert(ApoderadoInputDto dto) {
		HashMap<Object, Object> insert = new HashMap<>();
		insert.put("apPaterno", dto.getApPaterno());
		insert.put("apMaterno", dto.getApMaterno());
		insert.put("nombre", dto.getNombre());
		insert.put("nroDni", dto.getNroDni());
		insert.put("nroTelefono", dto.getNroTelefono());
		insert.put("codOperador", dto.getCodOperador());
		apoderadoMapper.insert(insert);
		Map<Object, Object> resp = new HashMap<>();
		resp.put("codError", insert.get("codError"));
		resp.put("msgError", insert.get("msgError"));
		return resp;
	}
	
	@Override
	public Map<Object, Object> update(ApoderadoInputDto dto) {
		HashMap<Object, Object> update = new HashMap<>();
		update.put("idApoderado", dto.getIdApoderado());
		update.put("apPaterno", dto.getApPaterno());
		update.put("apMaterno", dto.getApMaterno());
		update.put("nombre", dto.getNombre());
		update.put("nroDni", dto.getNroDni());
		update.put("nroTelefono", dto.getNroTelefono());
		update.put("codOperador", dto.getCodOperador());
		apoderadoMapper.update(update);
		Map<Object, Object> resp = new HashMap<>();
		resp.put("codError", update.get("codError"));
		resp.put("msgError", update.get("msgError"));
		return resp;
	}
}
