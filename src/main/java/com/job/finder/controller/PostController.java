package com.job.finder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.job.finder.model.Post;
import com.job.finder.repo.PostRepo;
import com.job.finder.repo.SearchRepository;


@RestController
public class PostController {
	
	@Autowired
	PostRepo repo;
	
	@Autowired
	SearchRepository serpo;
	
	@GetMapping("/posts")
	public List<Post> getAllPosts(){
		return repo.findAll();
	}
	
	@GetMapping("/posts/{text}")
	public List<Post> search(@PathVariable String text){
		return serpo.findBytext(text);
	}
	
	
	@PostMapping("/posts")
	public Post addPosts(@RequestBody Post p) {
		return repo.save(p);
	}
	
}
