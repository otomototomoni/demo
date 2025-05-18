package com.example.demo.controller

import com.example.demo.domain.Todo
import com.example.demo.service.TodoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/*
    Todoに関する処理をフロントエンドから実際に呼び出せるようにするところ
    エンドポイントとRestAPIを指定し、どのような処理を行うかを記述。
    TodoServiceのinterfaceのメソッドを呼び出すだけにして綺麗に使用したい。
 */
@RestController
class TodoController( val todoService: TodoService) {
    @GetMapping("/todos")
    fun getTodos(): List<Todo> {
        return todoService.getAllTodos()
    }
}