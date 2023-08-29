package com.bootcamp.projectosemana01.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bootcamp.projectosemana01.model.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "client")
public class ClientDocument {
	
	@Id
	String id; 
	String name;
	String type;
	

}
