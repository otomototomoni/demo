package com.example.demo.domain.persona

import jakarta.persistence.*

/*
    ペルソナについてまとめるメインとなるテーブル
 */
@Entity
@Table(name = "personas")
class Persona (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "name",nullable = true)
    var name: String? = null,

    @Column(name = "age",nullable = true)
    var age: Int? = null,

    @Column(name = "gender",nullable = true)
    var gender: String? = null,

    //心理的変数。Persona　-　中間テーブル　-　心理的変数テーブル　の中間テーブルの役割を果たす
    @ManyToMany
    @JoinTable(
        name = "persona_psychological_valiables",
        joinColumns = [JoinColumn(name = "persona_id")],
        inverseJoinColumns = [JoinColumn(name = "variable_id")]
    )
    val variables: MutableList<PsychologicalVariables> = mutableListOf()
)