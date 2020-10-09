package com.exemple.manytomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.manytomany.models.Trend;

@Repository
public interface TagRepository extends JpaRepository<Trend, Long> {

}