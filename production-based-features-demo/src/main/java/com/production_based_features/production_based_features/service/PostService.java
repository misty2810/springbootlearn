package com.production_based_features.production_based_features.service;

import com.production_based_features.production_based_features.dto.postDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    List<postDto> getAllPosts();
    postDto createNewPost(postDto inputpost);
}
