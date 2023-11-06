package com.springboot.onetomanymapping;

import com.springboot.onetomanymapping.entity.Comment;
import com.springboot.onetomanymapping.entity.Post;
import com.springboot.onetomanymapping.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;


	@Override
	public void run(String... args) throws Exception {

		Post post = new Post("Spring Boot Mapping", "This is used to map one table to another");

		Comment comment1 = new Comment("Very useful");
		Comment comment2 = new Comment("informative");
		Comment comment3 = new Comment("Great post");


		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);




		Post post1=new Post("Very useful website to learn java","Java Guide");
		Comment comment4 = new Comment("Yes, i also trust this website");
		post.getComments().add(comment4);
		this.postRepository.save(post);


	}
}
