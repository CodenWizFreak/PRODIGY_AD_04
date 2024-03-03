package com.example.tictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button
    private lateinit var b4: Button
    private lateinit var b5: Button
    private lateinit var b6: Button
    private lateinit var b7: Button
    private lateinit var b8: Button
    private lateinit var b9: Button
    private lateinit var btnReset: Button
    var player="p1"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        btnReset = findViewById(R.id.btnReset)
        b1.setOnClickListener{
            buttonClick(b1)
        }
        b2.setOnClickListener{
            buttonClick(b2)
        }
        b3.setOnClickListener{
            buttonClick(b3)
        }
        b4.setOnClickListener{
            buttonClick(b4)
        }
        b5.setOnClickListener{
            buttonClick(b5)
        }
        b6.setOnClickListener{
            buttonClick(b6)
        }
        b7.setOnClickListener{
            buttonClick(b7)
        }
        b8.setOnClickListener{
            buttonClick(b8)
        }
        b9.setOnClickListener{
            buttonClick(b9)
        }

        btnReset.setOnClickListener{
            reset()
        }
    }

    private fun buttonClick(btn: Button){
        if (btn.text == "")
        {
            if (player == "p1") {
                player="p2"
                btn.text = "X"
            }
            else {
                player="p1"
                btn.text = "O"
            }

        }
        win()
    }

    fun win(){
        if(b1.text=="X"&& b2.text=="X"&& b3.text=="X"){
            toast("X won the game!")
        }
        else if(b1.text=="O"&& b2.text=="O"&& b3.text=="O"){
            toast("O won the game!")
        }
        else if(b4.text=="X"&& b5.text=="X"&& b6.text=="X"){
            toast("X won the game!")
        }
        else if(b4.text=="O"&& b5.text=="O"&& b6.text=="O"){
            toast("O won the game!")
        }
        else if(b7.text=="X"&& b8.text=="X"&& b9.text=="X"){
            toast("X won the game!")
        }
        else if(b7.text=="O"&& b8.text=="O"&& b9.text=="O"){
            toast("O won the game!")
        }
        else if(b1.text=="X"&& b4.text=="X"&& b7.text=="X"){
            toast("X won the game!")
        }
        else if(b1.text=="O"&& b4.text=="O"&& b7.text=="O"){
            toast("O won the game!")
        }
        else if(b2.text=="X"&& b5.text=="X"&& b8.text=="X"){
            toast("X won the game!")
        }
        else if(b2.text=="O"&& b5.text=="O"&& b8.text=="O"){
            toast("O won the game!")
        }
        else if(b3.text=="X"&& b6.text=="X"&& b9.text=="X"){
            toast("X won the game!")
        }
        else if(b3.text=="O"&& b6.text=="O"&& b9.text=="O"){
            toast("O won the game!")
        }
        else if(b1.text=="X"&& b5.text=="X"&& b9.text=="X"){
            toast("X won the game!")
        }
        else if(b1.text=="O"&& b5.text=="O"&& b9.text=="O"){
            toast("O won the game!")
        }
        else if(b3.text=="X"&& b5.text=="X"&& b7.text=="X"){
            toast("X won the game!")
        }
        else if(b3.text=="O" && b5.text=="O" && b7.text=="O"){
            toast("O won the game!")
        }
        else{
            if(b1.text!=""&&b2.text!=""&&b3.text!=""&&b4.text!=""&&b5.text!=""&&b6.text!=""&&b7.text!=""&&b8.text!=""&&b9.text!="")
                toast("Match Tied/Drawn!")
        }
    }

    fun toast(msg:String){
        Toast.makeText(this@MainActivity,msg, Toast.LENGTH_LONG).show()
    }

    fun reset(){
        b1.text=""
        b2.text=""
        b3.text=""
        b4.text=""
        b5.text=""
        b6.text=""
        b7.text=""
        b8.text=""
        b9.text=""
    }

}