package com.app.mytoys.repository;

import com.app.mytoys.entity.Toy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ToyRepository extends MongoRepository<Toy, String> {
    @Query(fields = "{working:-1}")
    List<Toy> findByWorking(Boolean working);
}
