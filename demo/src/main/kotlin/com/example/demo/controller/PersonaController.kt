package com.example.demo.controller

import com.example.demo.dto.persona.PersonaRequest
import com.example.demo.service.persona.PersonaService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/*
    ペルソナについて
    Todo:データを入れる。データを取得する。データを消す。
 */
@RestController
class PersonaController(val personaService: PersonaService) {

    //ペルソナの名前、年齢、性別を登録する　name:String,age:Int,gender:String
    @PostMapping("/personaAdd")
    fun personaAdd(@RequestBody request: PersonaRequest){
        personaService.personaAdd(request)
    }

}