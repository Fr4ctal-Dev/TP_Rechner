package com.example.rechner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.*
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText2 : EditText
        val editText : EditText
        var rg : RadioGroup = findViewById(R.id.operatorGroup)
        var checkedRB : RadioButton

        var historyShow: Button = findViewById(R.id.history_button)

        val history = History()

        var historySwitch: Switch

        var resTextView : TextView

        editText2 = findViewById(R.id.editTextNumber2)

        editText = findViewById(R.id.editTextNumber)








        fun calculate(){

            resTextView = findViewById(R.id.textView)
            historySwitch = findViewById(R.id.switch1)





            rg = findViewById(R.id.operatorGroup)
            checkedRB = findViewById(rg.checkedRadioButtonId)


            if (editText.text.toString().isBlank()) return
            if (editText2.text.toString().isBlank()) return

            var num1: Double = editText.text.toString().toDouble()
            var num2 = editText2.text.toString().toDouble()

            var operator : String? = ""

            var res : Double = 0.0

                when (checkedRB.text.toString()){
                "Addition" -> {res=num1+num2; operator=" + ";}
                "Multiplication" -> {res=num1*num2; operator=" * "}
                "Division" -> {res=num1/num2; operator=" / "}
                "Subtraction" -> {res=num1- num2; operator=" - "}
            }

            if (historySwitch.isChecked){
                history.history.add(num1.toString() + operator + num2.toString() + " = " + res.toString() + "\n")
            }

            Log.i("MAIN", history.history.toString())


            resTextView.text = res.toString()

        }

        val myTextWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                calculate()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }
        }

        val myRadioWatcher = object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                calculate()
            }
        }


        historyShow.setOnClickListener{
            val intent = Intent(this, HistoryActivity::class.java)

            intent.putExtra("history", history.history.toString())
            startActivity(intent)

        }





        editText2.addTextChangedListener(myTextWatcher)
        editText.addTextChangedListener(myTextWatcher)


        rg.setOnCheckedChangeListener(myRadioWatcher)










        //val num1 : Double? = findViewById<EditText>(R.id.editTextNumber).text.toString().toDouble()
        //val num2 : Double? = findViewById<EditText>(R.id.editTextNumber2).text.toString().toDouble()




    }



}