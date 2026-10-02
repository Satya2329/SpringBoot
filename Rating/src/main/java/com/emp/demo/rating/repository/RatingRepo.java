package com.emp.demo.rating.repository;

import com.emp.demo.rating.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepo extends MongoRepository<Rating, String> {
}
