package com.example.jokempo

import android.os.Bundle
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
        respostaVitoriaGame()
    }

    private fun botoesUsuario() = with(binding) {
        imgPedra.setOnClickListener { respostaCliqueUser("pedra") }
        imgPapel.setOnClickListener { respostaCliqueUser("papel") }
        imgTesoura.setOnClickListener { respostaCliqueUser("tesoura") }
        imgSpock.setOnClickListener { respostaCliqueUser("spock") }
        imgLagarto.setOnClickListener { respostaCliqueUser("lagarto") }
    }


    private fun respostaCliqueUser(clickDoUser: String) {
        viewModel.escolhaDoUsuario(clickDoUser)
    }

    fun respostaVitoriaGame( ) {
        viewModel.resultadoFinal.observe(viewLifecycleOwner) {
            binding.resultado.text = it
        }
    }
}