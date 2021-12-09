package com.example.seismerecords.repositories;

import com.example.seismerecords.entities.Localisation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocalisationRepository extends MongoRepository<Localisation, String> {
}
