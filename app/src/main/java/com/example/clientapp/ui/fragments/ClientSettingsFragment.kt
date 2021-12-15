package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.clientapp.R
import com.example.clientapp.databinding.FragmentClientSettingsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClientSettingsFragment : Fragment() {

    private lateinit var binding: FragmentClientSettingsBinding
    private lateinit var navController: NavController

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
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.apply {

            ivLeft.setOnClickListener {

                navController.navigate(R.id.action_clientSettingsFragment_to_clientProfileFragment)
            }
            tvLeft.setOnClickListener {

                navController.navigate(R.id.action_clientSettingsFragment_to_clientProfileFragment)
            }
        }
    }
}