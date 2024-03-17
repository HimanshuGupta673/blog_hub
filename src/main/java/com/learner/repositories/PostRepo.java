package com.learner.repositories;

import com.learner.entities.Category;
import com.learner.entities.Post;
import com.learner.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post,Integer> {
  List<Post> findByUser(User user);
  List<Post> findByCategory(Category category);
}
