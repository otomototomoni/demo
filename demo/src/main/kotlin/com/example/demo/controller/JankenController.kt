package com.example.demo.controller

import com.example.demo.dto.JankenRequest
import com.example.demo.dto.JankenResponse
import com.example.demo.service.JankenService
import org.springframework.web.bind.annotation.*

/*
    じゃんけんのcontroller
 */
@RestController
class JankenController(val jankenService:JankenService) {

    @PostMapping("/janken")
    fun play(@RequestBody request: JankenRequest): JankenResponse {
        return jankenService.playJanken(request)
    }
}