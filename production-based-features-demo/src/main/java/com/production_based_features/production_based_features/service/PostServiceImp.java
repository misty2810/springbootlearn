package com.production_based_features.production_based_features.service;

import com.production_based_features.production_based_features.dto.postDto;
import com.production_based_features.production_based_features.entities.PostEntity;
import com.production_based_features.production_based_features.exceptions.ResourceNotFoundException;
import com.production_based_features.production_based_features.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImp implements PostService{
    private final PostRepository postRepository;
    private final ModelMapper modelMapper;


    public PostServiceImp(PostRepository postRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public List<postDto> getAllPosts() {
        return postRepository
                .findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity, postDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public postDto createNewPost(postDto inputpost) {
        PostEntity postEntity= modelMapper.map(inputpost,PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity),postDto.class);
    }

    @Override
    public postDto getPostById(Long postId) {
        PostEntity postEntity= postRepository
                .findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found with id "+postId));
        return modelMapper.map(postEntity, postDto.class);
    }

    @Override
    public postDto updatePost(postDto inputPost, Long postId) {
        PostEntity olderPost= postRepository
                .findById(postId)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found with id "+postId));
        inputPost.setPostid(postId);
        modelMapper.map(inputPost, olderPost);
        PostEntity savedPostEntity = postRepository.save(olderPost);
        return modelMapper.map(savedPostEntity, postDto.class);
    }
}
