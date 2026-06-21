package com.production_based_features.production_based_features.controller;

import com.production_based_features.production_based_features.dto.postDto;
import com.production_based_features.production_based_features.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    public List<postDto> getAllPosts(){
        return postService.getAllPosts();
    }
    @PostMapping
    public postDto createNewPost(@RequestBody postDto inputpost){
        return postService.createNewPost(inputpost);
    }
    @GetMapping("/{postId}")
    public postDto getPostById(@PathVariable Long postId) {
        return postService.getPostById(postId);
    }

    @PutMapping("{postId}")
    public postDto updatePost(@RequestBody postDto inputPost,@PathVariable Long postId ) {
        return postService.updatePost(inputPost, postId);
    }
}
