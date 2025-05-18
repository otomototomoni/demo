package com.example.demo.controller

import com.example.demo.Todo
import com.example.demo.TodoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController( val todoRepository: TodoRepository) {
    @GetMapping("/todos")
    fun getTodos(): List<Todo> {
        return todoRepository.findAll()
    }
}