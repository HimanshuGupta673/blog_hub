package com.learner.services;

import com.learner.entities.Post;
import com.learner.payLoad.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto , Integer userId, Integer categoryId);

    PostDto updatePost(PostDto postDto,Integer postId);

    void deletePost(Integer postId);

    List<PostDto> getAllPost();

    PostDto getPostById(Integer postId);

    List<PostDto> getPostsByCategory(Integer categoryId);

    List<PostDto> getPostByUser(Integer userId);

    List<PostDto> searchPosts(String keyword);
}
