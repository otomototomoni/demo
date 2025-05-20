package com.example.demo.domain.persona

import jakarta.persistence.*

/*
    ペルソナの心理的変数に関するテーブル
 */
@Entity
@Table(name = "psychological_variables")
class PsychologicalVariables (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "name", nullable = true)
    var name: String? = null,
)