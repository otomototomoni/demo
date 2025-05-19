package com.example.demo.service.persona

import com.example.demo.domain.persona.Persona
import com.example.demo.dto.persona.PersonaRequest
import com.example.demo.repository.PersonaRepository
import org.springframework.stereotype.Service

/*
    ペルソナに関するServiceImpl
    実際にロジックを書くところ
 */
@Service
class PersonaServiceImpl(private val personaRepository: PersonaRepository): PersonaService {

    //Personaテーブルにペルソナの名前、年齢、性別を登録する。
    override fun personaAdd(request: PersonaRequest) {
        val persona = Persona(
            name = request.name,
            age = request.age,
            gender = request.gender
        )
        personaRepository.save(persona)
    }
}