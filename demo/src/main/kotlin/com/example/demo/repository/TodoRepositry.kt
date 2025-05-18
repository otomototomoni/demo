package com.example.demo.repository

import com.example.demo.domain.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/*
    Repositoryの定義
    ServiceImplで使用
    細かなロジックはServiceImplに記述
    将来的にこのリポジトリーにクエリなどのデータベースとのやり取りを記述していく
 */
@Repository
interface TodoRepository : JpaRepository<Todo, Long>