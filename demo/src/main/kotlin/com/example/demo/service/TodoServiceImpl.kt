package com.example.demo.service

import com.example.demo.domain.Todo
import com.example.demo.repository.TodoRepository
import org.springframework.stereotype.Service

/*
    TodoのServiceImple
    実際ロジックを記述するところ
    Repositoryをインターフェイスとして受け取っている。
    その他のTodoに関する処理を記述していくところ
    ここで記述したメソッドをTodoServiceのinterfaceでまとめる
    Todo：質問内容
        DIコンテナに登録することでどのようなメリットがありますか？またDIとは何ですか？
 */
@Service
class TodoServiceImpl (val todoRepository: TodoRepository):TodoService {
    override fun getAllTodos():List<Todo>{
        return todoRepository.findAll()
    }
}