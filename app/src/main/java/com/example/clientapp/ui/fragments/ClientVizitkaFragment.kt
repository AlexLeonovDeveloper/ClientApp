package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clientapp.databinding.FragmentClientVizitkaBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClientVizitkaFragment : Fragment() {

    private lateinit var binding: FragmentClientVizitkaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientVizitkaBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}