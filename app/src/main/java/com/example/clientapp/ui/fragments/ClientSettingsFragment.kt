package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clientapp.databinding.FragmentClientSettingsBinding


class ClientSettingsFragment : Fragment() {

    private lateinit var binding: FragmentClientSettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientSettingsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}