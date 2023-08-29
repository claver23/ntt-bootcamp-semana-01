package com.bootcamp.projectosemana01.mapper;

import org.springframework.context.annotation.Bean;

import com.bootcamp.projectosemana01.documents.ClientDocument;
import com.bootcamp.projectosemana01.model.Client;

public class ClientMapper {
	
	public static ClientDocument dtoToDocument(Client dto) {		
		return  ClientDocument.builder()
				.id(dto.getId())
				.name(dto.getName())
//				.type(dto.getType())
				.build();	
	}
	
	public static Client DocumentoToDto(ClientDocument doc) {		
		Client dto = new Client();
		dto.setId(doc.getId());
		dto.setName(doc.getName());
//		dto.setType(doc.getType());		
		return dto;
	}
	

}
