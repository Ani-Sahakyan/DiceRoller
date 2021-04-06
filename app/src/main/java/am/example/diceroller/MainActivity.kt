package am.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six)
        val diceImage = findViewById<ImageView>(R.id.diceImage)
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        diceImage.setImageResource(R.drawable.dice)

        button.setOnClickListener(View.OnClickListener {
            var randNum =(1..6).random()
            textView.text = "Dice Number : $randNum"
            diceImage.setImageResource(list.get(randNum-1))
        })
    }
}