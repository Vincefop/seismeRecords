package com.example.seismerecords.repositories;


import com.example.seismerecords.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeismeRepository extends MongoRepository<Seisme, String> {
}
