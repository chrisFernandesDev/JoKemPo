package com.example.jokempo

class ListaDoJogoEnum() {
    enum class RespostasApp() {
        pedra, papel, tesoura, spock, lagarto,
    }
    val randomAnswer = RespostasApp.values().toList().shuffled().first()
}

