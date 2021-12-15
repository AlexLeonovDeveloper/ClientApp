package com.example.clientapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clientapp.R
import com.example.clientapp.databinding.FragmentVubratUsluguBinding
import com.example.clientapp.models.*
import com.example.clientapp.ui.adapters.ParentRVClientAdapter
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class VubratUsluguFragment : Fragment() {

    private lateinit var binding: FragmentVubratUsluguBinding
    private lateinit var navController: NavController
    private lateinit var bottom: com.google.android.material.bottomnavigation.BottomNavigationView
    private lateinit var listViewAdapter: ParentRVClientAdapter
    private val garbageList: List<TopicClientService> by lazy {

        listOf(
            TopicClientService("Антицеллюлитная программа", mutableListOf()),
            TopicClientService("Микротоки", mutableListOf()),
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVubratUsluguBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            BottomSheetBehavior.from(sheets).apply {
                peekHeight = 200
                this.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        navController = Navigation.findNavController(view)

        bottom = requireActivity().findViewById(R.id.nav_bottom)
        bottom.visibility = View.GONE

            showList()

            listViewAdapter = ParentRVClientAdapter(garbageList)
            eListView.adapter = listViewAdapter
            eListView.layoutManager = LinearLayoutManager(context)

            ivLeft.setOnClickListener {

                navController.navigate(R.id.action_vubratUsluguFragment_to_clientServicesFragment)
            }
            tvLeft.setOnClickListener {

                navController.navigate(R.id.action_vubratUsluguFragment_to_clientServicesFragment)
            }
        }
    }
    private fun showList() {

        lifecycleScope.launch(Dispatchers.IO) {

        val listCashe = arrayListOf<ClientService>()
        val top1 = ClientService("Ультразвуковая коррекция фигуры (бедра, ягодицы)", "1 200 ₽","45 мин.")
        val top2 = ClientService("Ультразвуковая коррекция фигуры (живот,бока,спина)", "1 200 ₽","45 мин.")
        val top3= ClientService("Ультразвуковая коррекция фигуры (нижняя часть тела)", "1 200 ₽","45 мин.")
        val top4 = ClientService("Ультразвуковая коррекция фигуры(руки)", "1 200 ₽","1 200 ₽45 мин.")

            listCashe.addAll(listOf(top1, top2, top3, top4))

            garbageList!![0].listAppGarbage.addAll(listCashe)
            garbageList!![1].listAppGarbage.addAll(listCashe)

            withContext(Dispatchers.Main) {
            listViewAdapter.notifyDataSetChanged()
            }
        }
    }
}