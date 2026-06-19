package com.production_based_features.production_based_features.controller;

import com.production_based_features.production_based_features.dto.postDto;
import com.production_based_features.production_based_features.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public List<postDto> getAllPosts(){
        return postService.getAllPosts();
    }
    @PostMapping
    public postDto createNewPost(@RequestBody postDto inputpost){
        return postService.createNewPost(inputpost);
    }
}
