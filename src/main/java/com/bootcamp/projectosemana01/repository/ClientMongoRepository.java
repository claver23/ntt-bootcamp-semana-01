package com.bootcamp.projectosemana01.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.projectosemana01.documents.ClientDocument;

@Repository
public interface ClientMongoRepository extends ReactiveMongoRepository<ClientDocument, String>{

}
