package com.example.demo.dto.persona

import com.example.demo.domain.persona.PsychologicalVariables

data class PersonaRequest(
    val name: String? = null,
    val age: Int? = null,
    val gender: String? = null,
    val psychologicalVariables: MutableList<PsychologicalVariables>
)
