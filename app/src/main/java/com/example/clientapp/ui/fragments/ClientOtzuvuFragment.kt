package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clientapp.databinding.FragmentClientOtzuvuBinding


class ClientOtzuvuFragment : Fragment() {

    private lateinit var binding: FragmentClientOtzuvuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientOtzuvuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}