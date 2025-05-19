package com.example.demo.repository

import com.example.demo.domain.persona.Persona
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/*
    ペルソナ登録用のRepository
 */
@Repository
interface PersonaRepository : JpaRepository<Persona,Long>