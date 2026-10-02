package com.emp.demo.rating.impl;

import com.emp.demo.rating.entity.Rating;
import com.emp.demo.rating.service.RatingService;

import java.util.List;

public class RatingImpl implements RatingService {
    @Override
    public Rating createRating(Rating r) {
        return null;
    }

    @Override
    public List<Rating> getAllRating() {
        return List.of();
    }

    @Override
    public List<Rating> findByUserId(String userId) {
        return List.of();
    }

    @Override
    public List<Rating> findByhotelId(String hotelId) {
        return List.of();
    }
}
