package com.exemple.manytomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.manytomany.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
