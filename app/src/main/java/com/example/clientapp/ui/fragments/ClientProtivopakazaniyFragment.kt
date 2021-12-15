package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.clientapp.R
import com.example.clientapp.databinding.FragmentClientProtivopakazaniyBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClientProtivopakazaniyFragment : Fragment() {

    private lateinit var binding: FragmentClientProtivopakazaniyBinding
    private lateinit var navController: NavController
    private lateinit var bottom: com.google.android.material.bottomnavigation.BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientProtivopakazaniyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bottom = requireActivity().findViewById(R.id.nav_bottom)
        bottom.visibility = View.GONE

        navController = Navigation.findNavController(view)

        binding.apply {

            BottomSheetBehavior.from(sheets).apply {
                peekHeight = 200
                this.state = BottomSheetBehavior.STATE_COLLAPSED
            }
            ivBack.setOnClickListener {

                navController.navigate(R.id.action_clientProtivopakazaniyFragment_to_clientProfileFragment)

            }
            tvBacks.setOnClickListener {

                navController.navigate(R.id.action_clientProtivopakazaniyFragment_to_clientProfileFragment)
            }
        }
    }
}