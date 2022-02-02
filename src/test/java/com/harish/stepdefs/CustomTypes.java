package com.harish.stepdefs;

import com.harish.enums.Operation;
import com.harish.models.Post;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;

import java.util.Map;

public class CustomTypes {

    @ParameterType("add|substract|multiply|divide")
    public Operation operation(final String op){
        return Operation.getOperationByType(op);
    }

    @DataTableType
    public Post post(final Map<String, String> postData){
        Post post = new Post();
        post.setId(Integer.parseInt(postData.get("id")));
        post.setUserId(Integer.parseInt(postData.get("userId")));
        post.setBody(postData.get("body"));
        post.setTitle(postData.get("title"));
        return post;
    }
}
