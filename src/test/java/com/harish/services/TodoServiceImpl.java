package com.harish.services;

import com.harish.Todo;
import com.harish.framework.BaseRestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl extends BaseRestService implements TodoService {

    private String url = "/todos";

    @Override
    public List<Todo> getAllTodos() {
        return null;
    }

    @Override
    public Todo addTodo(Todo todo) {
        return null;
    }

    @Override
    public void removeTodo(int id) {

    }

    @Override
    public Todo updateTodo(Todo todo) {
        return null;
    }
}
