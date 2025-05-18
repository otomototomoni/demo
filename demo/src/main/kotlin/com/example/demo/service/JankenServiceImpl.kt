package com.example.demo.service

import com.example.demo.dto.JankenRequest
import com.example.demo.dto.JankenResponse
import org.springframework.stereotype.Service

/*
    じゃんけんのseviceimpl
 */
@Service
class JankenServiceImpl:JankenService {
    //手をまとめておくところ
    private val hands = listOf("rock", "paper", "scissors")

    //基本的なじゃんけん
    //勝ち負けとコンピューターの手を返す。
    override fun playJanken(request: JankenRequest): JankenResponse {
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