package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.clientapp.R
import com.example.clientapp.databinding.FragmentClientPersonalInformationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClientPersonalInformationFragment : Fragment() {

    private lateinit var binding: FragmentClientPersonalInformationBinding
    private lateinit var navController: NavController
    private lateinit var bottom: com.google.android.material.bottomnavigation.BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientPersonalInformationBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bottom = requireActivity().findViewById(R.id.nav_bottom)
        bottom.visibility = View.VISIBLE

        navController = Navigation.findNavController(view)

        binding.apply {

            ivLeft.setOnClickListener {

                navController.navigate(R.id.action_clientPersonalInformationFragment_to_clientProfileFragment)
            }
            tvLeft.setOnClickListener {

                navController.navigate(R.id.action_clientPersonalInformationFragment_to_clientProfileFragment)
            }
            tvBacks.setOnClickListener {

                navController.navigate(R.id.action_clientPersonalInformationFragment_to_clientProfileFragment)
            }
        }
    }
}