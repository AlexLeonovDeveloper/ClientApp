package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clientapp.databinding.FragmentClientInterestingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClientInterestingFragment : Fragment() {

    private lateinit var binding: FragmentClientInterestingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientInterestingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}