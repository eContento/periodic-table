package org.autentia.lab;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class ElementService {
	
	@Inject
	public MapperService mapper;
	
	public Response create(ElementDto dto) {		
		if (alreadyExists(dto)) {
			return Response.status(201).build();
		}
		
		ElementEntity entity = mapper.toEntity(dto);
		entity.persist();
		return Response.ok().build();
	}

	private boolean alreadyExists(ElementDto dto) {
		return (ElementEntity.findBySymbol(dto.symbol) != null);
	}
}
