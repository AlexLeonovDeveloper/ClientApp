package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.clientapp.R
import com.example.clientapp.databinding.FragmentClientServicesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClientServicesFragment : Fragment() {

    private lateinit var binding: FragmentClientServicesBinding
    private lateinit var navController: NavController
    private lateinit var bottom: com.google.android.material.bottomnavigation.BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientServicesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.apply {

            ivYslugi.setOnClickListener {

                navController.navigate(R.id.action_clientServicesFragment_to_vubratUsluguFragment)
            }
        }
    }
    override fun onResume() {
        super.onResume()

        bottom = requireActivity().findViewById(R.id.nav_bottom)
        bottom.visibility = View.VISIBLE
    }
}
