package com.example.demo.service

import com.example.demo.dto.JankenRequest
import com.example.demo.dto.JankenResponse

/*
    じゃんけんのservice
 */
interface JankenService {
    fun playJanken(request: JankenRequest): JankenResponse
}