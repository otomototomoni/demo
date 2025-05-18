package com.example.demo

import jakarta.persistence.*
import org.springframework.data.annotation.Id
import java.time.OffsetDateTime

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
