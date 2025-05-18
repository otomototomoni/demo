package com.example.demo.domain

import jakarta.persistence.*
import java.time.OffsetDateTime

/*
    データベースで扱うテーブルを定義している。
    一つのファイルに一つのEntityが基本なのでこれ以上テーブルは増やさない。増やしたい場合はファイルを増やす。
 */
@Entity
@Table(name = "todo")
class Todo(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "title")
    var title: String,

    @Column(name = "description")
    var description: String?,

    @Column(name = "is_completed")
    var isCompleted: Boolean,

    @Column(name = "created_at")
    var createdAt: OffsetDateTime,

    @Column(name = "updated_at")
    var updatedAt: OffsetDateTime
)
