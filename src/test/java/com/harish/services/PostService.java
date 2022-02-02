package com.harish.services;

import com.harish.models.Post;
import com.harish.response.PostServiceResponse;
import io.restassured.response.Response;

import java.util.List;

public interface PostService {
    public PostServiceResponse getAllPosts();
    public PostServiceResponse addPost(final Post po);
}
