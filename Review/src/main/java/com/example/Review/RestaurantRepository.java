package com.example.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    List<Restaurant> findByLocation(String location);

    @Query("SELECT r FROM Restaurant r WHERE r.name LIKE %?1%")
    List<Restaurant> searchByName(String name);
}
