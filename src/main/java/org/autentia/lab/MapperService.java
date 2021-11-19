package org.autentia.lab;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MapperService {

	public ElementEntity toEntity(ElementDto dto) {
		if (dto!=null) {
			ElementEntity entity = new ElementEntity();
			entity.symbol = dto.symbol;
			entity.name = dto.name;
			entity.group = dto.group;
			entity.period = dto.period;
			entity.atomicNumber = dto.atomicNumber;
			entity.atomicMass = dto.atomicMass;
			entity.electronConfiguration = dto.electronConfiguration;
			return entity;
		}
		return null;
	}

}
