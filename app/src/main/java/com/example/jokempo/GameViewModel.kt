package com.example.jokempo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.floor

class GameViewModel : ViewModel() {

    private val _escolhaUser = MutableLiveData<String>()
    val escolhaUser: LiveData<String> get() = _escolhaUser

    var resultadoFinal: String = ""


    init {
        escolhaDoClickApp()
    }

    fun escolhaDoClickApp(): String {
        val aleatorio = floor(Math.random() * 5)
        val resultadoAleatorio = when (aleatorio) {
            0.0 -> "pedra"
            1.0 -> "papel"
            2.0 -> "tesoura"
            3.0 -> "spock"
            else -> "lagarto"
        }
        return resultadoAleatorio
    }

    fun escolhaDoUsuario(item: String) {
        _escolhaUser.value = item
        if (escolhaDoClickApp() == "pedra") {
            if (_escolhaUser.value == "pedra") {
                resultadoFinal = "Empate"
            }
            if (_escolhaUser.value == "papel") {
                resultadoFinal = "User Ganhou"
            }
            if (_escolhaUser.value == "tesoura") {
                resultadoFinal = "App Ganhou"
            }
            if (_escolhaUser.value == "spock") {
                resultadoFinal = "User Ganhou";
            }
            if (_escolhaUser.value == "lagarto") {
                resultadoFinal = "APP Ganhou";
            }
        }

        if (escolhaDoClickApp() == "papel") {
            if (_escolhaUser.value == "pedra") {
                resultadoFinal = "APP Ganhou";
            }
            if (_escolhaUser.value == "papel") {
                resultadoFinal = "Empate";
            }
            if (_escolhaUser.value == "tesoura") {
                resultadoFinal = "User Ganhou";
            }
            if (_escolhaUser.value == "spock") {
                resultadoFinal = "APP Ganhou";
            }
            if (_escolhaUser.value == "lagarto") {
                resultadoFinal = "User Ganhou";
            }
        }

        if (escolhaDoClickApp() == "tesoura") {
            if (_escolhaUser.value == "pedra") {
                resultadoFinal = "User Ganhou";
            }
            if (_escolhaUser.value == "papel") {
                resultadoFinal = "APP Ganhou";
            }
            if (_escolhaUser.value == "tesoura") {
                resultadoFinal = "Empate";
            }
            if (_escolhaUser.value == "spock") {
                resultadoFinal = "APP Ganhou";
            }
            if (_escolhaUser.value == "lagarto") {
                resultadoFinal = "User Ganhou";
            }
        }

        if (escolhaDoClickApp() == "spock") {
            if (_escolhaUser.value == "pedra") {
                resultadoFinal = "User Ganhou";
            }
            if (_escolhaUser.value == "papel") {
                resultadoFinal = "APP Ganhou";
            }
            if (_escolhaUser.value == "tesoura") {
                resultadoFinal = "User Ganhou";
            }
            if (_escolhaUser.value == "spock") {
                resultadoFinal = "Empate";
            }
            if (_escolhaUser.value == "lagarto") {
                resultadoFinal = "APP Ganhou";
            }
        }

        if (escolhaDoClickApp() == "lagarto") {
            if (_escolhaUser.value == "pedra") {
                resultadoFinal = "User Ganhou";
            }
            if (_escolhaUser.value == "papel") {
                resultadoFinal = "APP Ganhou";
            }
            if (_escolhaUser.value == "tesoura") {
                resultadoFinal = "User Ganhou";
            }
            if (_escolhaUser.value == "spock") {
                resultadoFinal = "APP Ganhou";
            }
            if (_escolhaUser.value == "lagarto") {
                resultadoFinal = "Empate";
            }
        }

        Log.d("Entrei aqui", resultadoFinal)
    }

//    fun resultadoJogo() {
//        val resultadoFinalDoJogo = when (escolhaDoUsuario("")) {
//            "pedra" -> "re"
//            else -> {}
//        }
//    }
}
