package com.SpringSecurity.Spring_Boot_Security_demo.services;

import com.SpringSecurity.Spring_Boot_Security_demo.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);
}
