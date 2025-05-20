package com.example.demo.service.persona

import com.example.demo.domain.persona.Persona
import com.example.demo.dto.persona.PersonaIdResponse
import com.example.demo.dto.persona.PersonaRequest
import com.example.demo.repository.PersonaRepository
import org.springframework.stereotype.Service

/*
    ペルソナに関するServiceImpl
    実際にロジックを書くところ
 */
@Service
class PersonaServiceImpl(private val personaRepository: PersonaRepository): PersonaService {

    //personaのテーブルを新規作成して、そのIdをフロントに返す。
    override fun personaNewEntry(): PersonaIdResponse {
        val newPersona = Persona()
        val personaId = personaRepository.save(newPersona).id
        return PersonaIdResponse(id = personaId)
    }

    //Personaテーブルにペルソナの名前、年齢、性別, その他変数を登録する。
    override fun personaOverWrite(id:Long,request: PersonaRequest) {
        val changePersona = personaRepository.findById(id).orElseThrow {
            NoSuchElementException("Persona with id $id not found")
        }
        //それぞれ変更する
        changePersona.name = request.name
        changePersona.age = request.age
        changePersona.gender = request.gender
        changePersona.psychologicalVariables = request.psychologicalVariables
        //セーブする
        personaRepository.save(changePersona)
    }

}