package com.emp.demo.rating.service;

import com.emp.demo.rating.entity.Rating;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RatingService {
    Rating createRating(@RequestBody Rating r);
    List<Rating> getAllRating();
    List<Rating> findByUserId(String userId);
    List<Rating> findByhotelId(String hotelId);
}
