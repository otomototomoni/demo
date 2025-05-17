package com.example.demo.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/janken")
class JankenController {

    private val hands = listOf("rock", "paper", "scissors")

    @PostMapping
    fun play(@RequestBody request: JankenRequest): JankenResponse {
        val userHand = request.hand
        val cpuHand = hands.random()

        val result = when {
            userHand == cpuHand -> "draw"
            (userHand == "rock" && cpuHand == "scissors") ||
                    (userHand == "scissors" && cpuHand == "paper") ||
                    (userHand == "paper" && cpuHand == "rock") -> "win"

            else -> "lose"
        }

        return JankenResponse(cpuHand, result)
    }
}

data class JankenRequest(val hand: String)
data class JankenResponse(val cpuHand: String, val result: String)