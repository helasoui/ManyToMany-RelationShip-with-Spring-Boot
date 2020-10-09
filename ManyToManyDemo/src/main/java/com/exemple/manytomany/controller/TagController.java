package com.exemple.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.manytomany.models.Tag;
import com.exemple.manytomany.repositories.TagRepository;

@RestController
@RequestMapping("/api/manytotmanytest/tag")
public class TagController {
	@Autowired
	private TagRepository tagRepository;

	// save tag
	@PostMapping("/savetag")
	public Tag saveTag(@RequestBody Tag tag) {
		return tagRepository.save(tag);

	}
}
