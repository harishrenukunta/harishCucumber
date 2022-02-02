package com.harish.response;

import com.harish.framework.BaseResponse;
import com.harish.models.Post;
import io.restassured.response.Response;

import java.util.Arrays;
import java.util.List;


public class PostServiceResponse extends BaseResponse {

    public PostServiceResponse(Response resp){
        super(resp);
    }

    public List<Post> getPosts(){
        Post[] posts = fromJson(Post[].class);
        return Arrays.asList(posts);
    }
}
