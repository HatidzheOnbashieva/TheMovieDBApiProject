package com.example.themoviedbapiproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.themoviedbapiproject.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private lateinit var viewBinding: FragmentSignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentSignInBinding.inflate(inflater, container, false)
        return viewBinding.root
    }


}