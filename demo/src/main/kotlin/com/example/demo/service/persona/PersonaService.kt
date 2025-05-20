package com.example.demo.service.persona

import com.example.demo.dto.persona.PersonaIdResponse
import com.example.demo.dto.persona.PersonaRequest

/*
    Personaに関するサービス群
    このinterfaceにあるメソッドをcontrollerで実行する
 */
interface PersonaService {
    fun personaNewEntry():PersonaIdResponse
    fun personaOverWrite(id:Long,request: PersonaRequest)
}