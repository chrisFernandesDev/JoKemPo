package com.example.jokempo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class GameViewModel : ViewModel() {

    private val _escolhaUser = MutableLiveData<String>()
    val escolhaUser: LiveData<String> = _escolhaUser

    private val _resultadoFinal = MutableLiveData<String>()
    var resultadoFinal: LiveData<String> = _resultadoFinal


    init {
        escolhaDoClickApp()
    }

    fun escolhaDoClickApp(): String{
        val randomValue = getRandomEnumValue()
        return randomValue.toString()
    }

    fun getRandomEnumValue(): ListaDoJogoEnum.RespostasApp {
        val values = ListaDoJogoEnum.RespostasApp.values()
        val randomValues = Random.nextInt(values.size)
        return values[randomValues]
    }

    fun escolhaDoUsuario(item: String) {
        _escolhaUser.value = item
        val escolhaApp = escolhaDoClickApp()

        val regras = mapOf(
            "pedra" to mapOf("pedra" to "Empate", "papel" to "User Ganhou", "tesoura" to "App Ganhou", "spock" to "User Ganhou", "lagarto" to "App Ganhou"),
            "papel" to mapOf("pedra" to "App Ganhou", "papel" to "Empate", "tesoura" to "User Ganhou", "spock" to "App Ganhou", "lagarto" to "User Ganhou"),
            "tesoura" to mapOf("pedra" to "User Ganhou", "papel" to "App Ganhou", "tesoura" to "Empate", "spock" to "App Ganhou", "lagarto" to "User Ganhou"),
            "spock" to mapOf("pedra" to "User Ganhou", "papel" to "App Ganhou", "tesoura" to "User Ganhou", "spock" to "Empate", "lagarto" to "App Ganhou"),
            "lagarto" to mapOf("pedra" to "User Ganhou", "papel" to "App Ganhou", "tesoura" to "User Ganhou", "spock" to "App Ganhou", "lagarto" to "Empate"),
        )

        _resultadoFinal.value = regras[escolhaApp]?.get(item) ?: ""
    }
}
