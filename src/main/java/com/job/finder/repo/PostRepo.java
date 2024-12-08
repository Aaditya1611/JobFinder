package com.job.finder.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.job.finder.model.Post;

public interface PostRepo extends MongoRepository<Post , String>{
	
}
