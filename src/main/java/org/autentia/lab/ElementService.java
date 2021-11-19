package org.autentia.lab;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class ElementService {
	
	@Inject
	public MapperService mapper;
	
	public Response createElement(ElementDto dto) {
		
		if (!exists(dto)) {
			ElementEntity entity = mapper.toEntity(dto);
			entity.persist();
			return Response.ok().build();
		} 
		
		return Response.status(201).build();
	}

	private boolean exists(ElementDto dto) {
		return (ElementEntity.findBySymbol(dto.symbol) != null);
	}
}
