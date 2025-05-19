package com.example.demo.service.persona

import com.example.demo.dto.persona.PersonaRequest

/*
    Personaに関するサービス群
    このinterfaceにあるメソッドをcontrollerで実行する
 */
interface PersonaService {
    fun personaAdd(request: PersonaRequest)
}