package com.harish.services;

import com.harish.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getAllTodos();
    public Todo addTodo(final Todo todo);
    public void removeTodo(final int id);
    public Todo updateTodo(final Todo todo);
}
