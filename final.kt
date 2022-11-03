package com.temp1.login

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User

class final : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.finalmessage)

        lateinit var database: DatabaseReference

        val savebtn = findViewById<Button>(R.id.savebtn)
        savebtn.setOnClickListener {
            var intern = findViewById<EditText>(R.id.intern)



            database = FirebaseDatabase.getInstance().getReference("Users")
            // intern = intern.text.toString()
            // val User = User(intern)
            database.child(intern).setValue(intern).addOnSuccessListener {

                intern.text.clear()


                Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()

            }.addOnFailureListener {

                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()


            }


        }
    }
}