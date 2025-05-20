package com.example.demo.controller

import com.example.demo.dto.persona.PersonaIdResponse
import com.example.demo.dto.persona.PersonaRequest
import com.example.demo.service.persona.PersonaService
import org.springframework.web.bind.annotation.*

/*
    ペルソナについて
    Todo:データを入れる。データを取得する。データを消す。
 */
@RestController
@RequestMapping("/persona")
class PersonaController(val personaService: PersonaService) {

    //ペルソナを新規作成、テーブルを追加する。Idをフロントに返すようにして、フロントでIdをUIにつけれるようにする。
    @PostMapping("/newEntry")
    fun personaNewEntry():PersonaIdResponse{
        return personaService.personaNewEntry()
    }

    //ペルソナの名前、年齢、性別を登録する　name:String,age:Int,gender:String
    //URL/persona/overWrite?id={id}
    @PutMapping("/overWrite")
    fun personaAdd(@RequestParam id:Long, @RequestBody request: PersonaRequest){
        personaService.personaOverWrite(id,request)
    }

}