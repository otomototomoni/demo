package com.example.demo.service

import com.example.demo.dto.JankenRequest
import com.example.demo.dto.JankenResponse

/*

 */
interface JankenService {
    fun playJanken(request: JankenRequest): JankenResponse
}