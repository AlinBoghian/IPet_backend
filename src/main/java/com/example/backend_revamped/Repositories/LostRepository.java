package com.example.backend_revamped.Repositories;

import com.example.backend_revamped.Models.Lost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LostRepository extends MongoRepository<Lost,String> {
}
