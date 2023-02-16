package com.example.jokempo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.viewModels
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jokempo.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private val viewModel: GameViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        botoesUsuario()
    }


    private fun botoesUsuario() {
        binding.imgPedra.setOnClickListener { (true)
            respostaCliqueUser("pedra")
            Log.d("Entrei aqui", "pedra")
        }
        binding.imgPapel.setOnClickListener {
            respostaCliqueUser("papel")
            Log.d("Entrei aqui", "papel")
        }
        binding.imgTesoura.setOnClickListener {
            respostaCliqueUser("tesoura")
            Log.d("Entrei aqui", "tesoura")
        }
        binding.imgSpock.setOnClickListener {
            respostaCliqueUser("spock")
            Log.d("Entrei aqui", "spock")
        }
        binding.imgLagarto.setOnClickListener {
            respostaCliqueUser("lagarto")
            Log.d("Entrei aqui", "lagarto")
        }
    }

    fun respostaCliqueUser(clickDoUser: String){
        viewModel.escolhaDoUsuario(clickDoUser)
    }

}