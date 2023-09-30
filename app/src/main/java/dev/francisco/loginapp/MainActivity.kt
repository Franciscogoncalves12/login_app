package dev.francisco.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.francisco.loginapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val utilizador = binding.editUtilizador.text.toString().trim()
            val senha = binding.editSenha.text.toString().trim()

            if (utilizador.equals("user") && senha.equals("pass")){
                Toast.makeText(applicationContext,"Logado com sucesso", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginOkActivity::class.java))
            }else{
                Toast.makeText(applicationContext,"Login Invalido", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginErradoActivity::class.java))
            }

            binding.editUtilizador.setText("")
            binding.editSenha.setText("")
        }
    }
}