package com.job.finder.repo;

import java.util.List;
import com.job.finder.model.Post;

public interface SearchRepository {

	List<Post> findBytext(String text);
}
