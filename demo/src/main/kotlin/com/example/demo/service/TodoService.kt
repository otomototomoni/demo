package com.example.demo.service

import com.example.demo.domain.Todo
import com.example.demo.repository.TodoRepository

/*
    Todoのinterface
    Controllerはこのinterfaceを実装し、その中のメソッドを呼ぶことで処理を行っている。
    TodoServiceImplのメソッドをここでまとめていく。
 */
interface TodoService{
    fun getAllTodos():List<Todo>
}