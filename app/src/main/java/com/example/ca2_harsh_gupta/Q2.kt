package com.example.ca2_harsh_gupta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.marginLeft
import androidx.core.view.marginRight

class Q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)
        val button=findViewById<Button>(R.id.button)
        val name=findViewById<EditText>(R.id.name)
        val M=findViewById<RadioButton>(R.id.male)
        val F=findViewById<RadioButton>(R.id.female)
        val O=findViewById<RadioButton>(R.id.other)
        val fiction=findViewById<CheckBox>(R.id.fiction)
        val biography=findViewById<CheckBox>(R.id.biography)
        val romantic=findViewById<CheckBox>(R.id.romantic)
        val radio=findViewById<RadioGroup>(R.id.radio)
        val form=findViewById<TextView>(R.id.Form)
        val a_form=findViewById<TextView>(R.id.ans)
         lateinit var radio_ans:String
        var check_ans:String?=""
        M.setOnClickListener(){
            val m_ans = M.isChecked()
            if(m_ans){
                radio_ans="Male"
                Toast.makeText(this,"Male", Toast.LENGTH_SHORT).show()
            }}
        F.setOnClickListener(){
            val f_ans = F.isChecked()
            if(f_ans){
                radio_ans="Female"
                Toast.makeText(this,"Female", Toast.LENGTH_SHORT).show()
            }}
        O.setOnClickListener(){
            val O_ans = O.isChecked()
            if(O_ans){
                radio_ans="Other"
                Toast.makeText(this,"Other", Toast.LENGTH_SHORT).show()
            }}
        fiction.setOnClickListener() {
            val fiction_ans = fiction.isChecked()
            if (fiction_ans) {
                Toast.makeText(this, "Fiction", Toast.LENGTH_SHORT).show()
            }
        }
        romantic.setOnClickListener() {
            val romantic_ans = romantic.isChecked()
            if (romantic_ans) {
                Toast.makeText(this, "Romantic", Toast.LENGTH_SHORT).show()
            }
        }
        biography.setOnClickListener() {
            val bio_ans = biography.isChecked()
            if (bio_ans) {
                Toast.makeText(this, "Biography", Toast.LENGTH_SHORT).show()
            }
        }
        button.setOnClickListener {
            check_ans=""
            val fiction_ans = fiction.isChecked()
            if (fiction_ans) {
                check_ans=check_ans+" Fiction"
            }

            val romantic_ans = romantic.isChecked()
            if (romantic_ans) {
                check_ans=check_ans+" Romantic"

            }
            val bio_ans = biography.isChecked()
            if (bio_ans) {
                check_ans=check_ans+" Bio-Graphy"
            }
            button.visibility= View.INVISIBLE
            name.visibility= View.INVISIBLE
            M.visibility= View.INVISIBLE
            F.visibility= View.INVISIBLE
            O.visibility= View.INVISIBLE
            fiction.visibility= View.INVISIBLE
            biography.visibility= View.INVISIBLE
            romantic.visibility= View.INVISIBLE
            a_form.setText(name.text.toString()+"-> "+radio_ans+" do like "+check_ans)

            Toast.makeText(this,name.text.toString()+"-> "+radio_ans+" do like "+check_ans, Toast.LENGTH_LONG).show()
        }
    }
}