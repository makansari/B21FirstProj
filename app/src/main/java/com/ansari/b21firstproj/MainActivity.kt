package com.ansari.b21firstproj

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_new_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_new_layout)


        buttonMyClick.setOnClickListener(View.OnClickListener {

           var username :String = editTextUsename.text.toString()
            Toast.makeText(this,"username is " + username,Toast.LENGTH_LONG).show()

           // textViewDisplay.setText("username")
            textViewDisplay.text = username

            var myIntent = Intent(this,SecondActivity::class.java)
            myIntent.putExtra("keyusername",username)
            startActivity(myIntent)

        })
    }
}
