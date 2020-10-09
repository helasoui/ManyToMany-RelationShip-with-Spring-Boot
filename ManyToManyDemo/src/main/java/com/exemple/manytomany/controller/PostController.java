package com.exemple.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.manytomany.models.Post;
import com.exemple.manytomany.models.Tag;
import com.exemple.manytomany.repositories.PostRepository;
import com.exemple.manytomany.repositories.TagRepository;

@RestController
@RequestMapping("/api/manytotmanytest/post")
public class PostController {

	

	@Autowired
	private PostRepository postRepository;

	

	@PostMapping("savePost")
	public Post savePost(@RequestBody Post post) {
		
		return postRepository.save(post);
	}
	
	
	

}
