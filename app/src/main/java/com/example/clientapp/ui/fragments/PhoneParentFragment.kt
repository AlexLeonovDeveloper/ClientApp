package com.example.clientapp.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clientapp.R
import com.example.clientapp.viewmodels.ParentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PhoneParentFragment : Fragment() {

    companion object {
        fun newInstance() = PhoneParentFragment()
    }
    private lateinit var viewModel: ParentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.parent_fragment, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ParentViewModel::class.java)
        // TODO: Use the ViewModel
    }
}