package com.example.jokempo

import android.content.ClipData.Item
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.floor

class GameViewModel : ViewModel() {

//    var escolhaUser: Boolean = false
    private val _escolhaUser = MutableLiveData<String>()
    val escolhaUser: LiveData<String> get() = _escolhaUser


    init {
        escolhaDoClickApp()
        Log.d("escolha", escolhaDoClickApp())
    }

    fun escolhaDoClickApp() : String {
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
                Log.d("Entrei aqui", "Result")
            }
        }

        if (escolhaDoClickApp() == "papel") {
            if (_escolhaUser.value == "papel") {
                Log.d("Entrei aqui", "Result")
            }
        }

        if (escolhaDoClickApp() == "tesoura") {
            if (_escolhaUser.value == "tesoura") {
                Log.d("Entrei aqui", "Result")
            }
        }

        if (escolhaDoClickApp() == "spock") {
            if (_escolhaUser.value == "spock") {
                Log.d("Entrei aqui", "Result")
            }
        }

        if (escolhaDoClickApp() == "lagarto") {
            if (_escolhaUser.value == "lagarto") {
                Log.d("Entrei aqui", "Result")
            }
        }



        Log.d("Entrei aqui", _escolhaUser.toString())
    }

//    fun resultadoJogo() {
//        val resultadoFinalDoJogo = when (escolhaDoUsuario("")) {
//            "pedra" -> "re"
//            else -> {}
//        }
//    }

//    fun resultadoJogo() {
//        if (escolhaDoClickApp() == "pedra") {
//            if (_escolhaUser == "pedra") {
//                resultado = "Empate";
//            }
//            if (escolhaUser == "papel") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "tesoura") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "spock") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "lagarto") {
//                resultado = "APP Ganhou";
//            }
//        }
//        if (escolhaApp == "papel") {
//            if (escolhaUser == "pedra") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "papel") {
//                resultado = "Empate";
//            }
//            if (escolhaUser == "tesoura") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "spock") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "lagarto") {
//                resultado = "User Ganhou";
//            }
//        }
//        if (escolhaApp == "tesoura") {
//            if (escolhaUser == "pedra") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "papel") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "tesoura") {
//                resultado = "Empate";
//            }
//            if (escolhaUser == "spock") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "lagarto") {
//                resultado = "User Ganhou";
//            }
//        }
//        if (escolhaApp == "spock") {
//            if (escolhaUser == "pedra") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "papel") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "tesoura") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "spock") {
//                resultado = "Empate";
//            }
//            if (escolhaUser == "lagarto") {
//                resultado = "APP Ganhou";
//            }
//        }
//        if (escolhaApp == "lagarto") {
//            if (escolhaUser == "pedra") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "papel") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "tesoura") {
//                resultado = "User Ganhou";
//            }
//            if (escolhaUser == "spock") {
//                resultado = "APP Ganhou";
//            }
//            if (escolhaUser == "lagarto") {
//                resultado = "Empate";
//            }
//        }
//    }
}