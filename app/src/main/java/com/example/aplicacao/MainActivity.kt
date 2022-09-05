package com.example.aplicacao


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.aplicacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var contador = 1

    var contar = 0

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.let { view ->
            setContentView(view.root)
        }


        contagem_mais()

        contagemmenos()

        zera()

    }

    fun contagem_mais() {
        maisdeum()
        binding?.contador?.text = contar.toString()
        binding?.botaomais?.setOnClickListener {
            contar = contar + contador
            binding?.contador?.text = contar.toString()
        }
    }

    fun contagemmenos() {
        maisdeum()
        binding?.botaomenos?.setOnClickListener {
            if (contar > 0) {
                contar = contar - contador
                if (contar < 0) {
                    contar = 0
                    binding?.contador?.text = contar.toString()
                }
                binding?.contador?.text = contar.toString()
            } else {
                Toast.makeText(this, "Já está em zero!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun zera() {
        binding?.botaozera?.setOnClickListener {
            if (contar > 0) {
                contar = 0
                binding?.contador?.text = contar.toString()
            } else {
                Toast.makeText(this, "Já está em zero!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun maisdeum() {
        with(binding) {
            this?.um?.setOnClickListener {
                this@MainActivity.contador = 1
            }
            this?.dois?.setOnClickListener {
                this@MainActivity.contador = 2
            }
            this?.trez?.setOnClickListener {
                this@MainActivity.contador = 3
            }
            this?.quatro?.setOnClickListener {
                this@MainActivity.contador = 4
            }
            this?.cinco?.setOnClickListener {
                this@MainActivity.contador = 5
            }
            this?.seis?.setOnClickListener {
                this@MainActivity.contador = 6
            }
            this?.sete?.setOnClickListener {
                this@MainActivity.contador = 7
            }
            this?.oito?.setOnClickListener {
                this@MainActivity.contador = 8
            }
            this?.nove?.setOnClickListener {
                this@MainActivity.contador = 9
            }
            this?.dez?.setOnClickListener {
                this@MainActivity.contador = 10
            }
        }
    }

}
