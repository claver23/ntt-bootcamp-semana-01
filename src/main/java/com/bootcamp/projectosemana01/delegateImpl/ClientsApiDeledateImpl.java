package com.bootcamp.projectosemana01.delegateImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.bootcamp.projectosemana01.api.ClientsApiDelegate;
import com.bootcamp.projectosemana01.mapper.ClientMapper;
import com.bootcamp.projectosemana01.model.Client;
import com.bootcamp.projectosemana01.repository.ClientMongoRepository;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Component
public class ClientsApiDeledateImpl implements ClientsApiDelegate{
	
	@Autowired
	ClientMongoRepository clientMongoRepo;

	@Override
	public Mono<ResponseEntity<Client>> createClient(Mono<Client> client, ServerWebExchange exchange) {
		return client
	            .flatMap(clientData -> {   
	                return clientMongoRepo.save(ClientMapper.dtoToDocument(clientData)).map(ClientMapper::DocumentoToDto);
	            })
	            .map(processedClient -> ResponseEntity.ok(processedClient));
	}

	@Override
	public Mono<ResponseEntity<Flux<Client>>> getAllClients(ServerWebExchange exchange) {
		return ClientsApiDelegate.super.getAllClients(exchange);
	}
}
