package com.example.aplicacao


import android.os.Bundle
import android.support.v4.content.ContextCompat
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

        contagem_menos()

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

    fun contagem_menos() {
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
        with(binding!!) {
            this.um.setOnClickListener {
                this@MainActivity.contador = 1
            }
            this.dois.setOnClickListener {
                this@MainActivity.contador = 2
            }
            this.trez.setOnClickListener {
                this@MainActivity.contador = 3
            }
            this.quatro.setOnClickListener {
                this@MainActivity.contador = 4
            }
            this.cinco.setOnClickListener {
                this@MainActivity.contador = 5
            }
            this.seis.setOnClickListener {
                this@MainActivity.contador = 6
            }
            this.sete.setOnClickListener {
                this@MainActivity.contador = 7
            }
            this.oito.setOnClickListener {
                this@MainActivity.contador = 8
            }
            this.nove.setOnClickListener {
                this@MainActivity.contador = 9
            }
            this.dez.setOnClickListener {
                this@MainActivity.contador = 10
            }
            filtro()
        }
    }

    fun filtro() {
        with(binding!!) {
            um.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            dois.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            trez.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            quatro.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            cinco.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            seis.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            sete.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            oito.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            nove.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
            dez.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.green))
        }
        if (contador == 1){
            binding!!.um.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 2){
            binding!!.dois.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 3){
            binding!!.trez.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 4){
            binding!!.quatro.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 5){
            binding!!.cinco.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 6){
            binding!!.seis.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 7){
            binding!!.sete.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 8){
            binding!!.oito.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 9){
            binding!!.nove.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }else if (contador == 10){
            binding!!.dez.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.red))
        }
    }
}

