package br.com.carlosbixa.componentes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var campo1: EditText
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campo1 = findViewById(R.id.editText)
        botao = findViewById(R.id.button2)

        botao.setOnClickListener{
            Toast.makeText(applicationContext,
                    campo1.text.toString(),
                    Toast.LENGTH_LONG).show()
        }
        ratingBar.setOnRatingBarChangeListener{
            ratingBar, rating, fromUser ->  rating
            Toast.makeText(applicationContext,
                    "" + rating,
                    Toast.LENGTH_LONG).show()
        }
        ratingBar.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener{
            override fun onRatingChanged(ratingBar: RatingBar?,
                                         rating: Float,
                                         fromUser: Boolean) {
                Toast.makeText(applicationContext,
                        "" + rating,
                        Toast.LENGTH_LONG).show()
            }
        })
    }
}
