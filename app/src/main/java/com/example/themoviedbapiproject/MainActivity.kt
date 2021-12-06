package com.example.themoviedbapiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.themoviedbapiproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

//        if (supportFragmentManager.fragments.isEmpty()) {
//
//        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, SignInFragment()).commit()

    }
}