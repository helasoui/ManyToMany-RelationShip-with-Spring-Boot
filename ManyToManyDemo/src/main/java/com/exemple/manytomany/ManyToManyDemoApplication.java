package com.exemple.manytomany;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.exemple.manytomany.models.Post;
import com.exemple.manytomany.models.Trend;
import com.exemple.manytomany.repositories.PostRepository;

@SpringBootApplication
public class ManyToManyDemoApplication implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyDemoApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... arg0) throws Exception {

		// create a post
		Post post = new Post("hibenrate many to many example with spring boot and postgresql",
				"hibenrate many to many example with spring boot and postgresql",
				"hibenrate many to many example with spring boot and postgresql");

		System.out.println("posts gettrends method retour" + post.getTrends());

		// create two trends
		Trend springboot = new Trend("spring boot");
		Trend hibernate = new Trend("hibernate");

		// add tags to posts
		post.getTrends().add(springboot);
		post.getTrends().add(hibernate);

		// add posts to tags
		System.out.println("trend getposts method retour" + springboot.getPosts());
		springboot.getPosts().add(post);
		hibernate.getPosts().add(post);

		// save post
		this.postRepository.save(post);

	}

}
