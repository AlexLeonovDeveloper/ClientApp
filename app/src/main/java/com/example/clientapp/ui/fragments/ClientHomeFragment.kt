package com.example.clientapp.ui.fragments

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clientapp.R
import com.example.clientapp.databinding.FragmentClientHomeBinding
import com.example.clientapp.models.BottomMain
import com.example.clientapp.models.CenterMain
import com.example.clientapp.models.TopMain
import com.example.clientapp.ui.adapters.BottomMainAdapter
import com.example.clientapp.ui.adapters.TopCenterAdapter
import com.example.clientapp.ui.adapters.TopMainAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ClientHomeFragment : Fragment() {

    private lateinit var binding: FragmentClientHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClientHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            requireActivity().getWindow().setNavigationBarColor(resources.getColor(R.color.white))
            requireActivity().getWindow().decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR)
        }
        val listTop = arrayListOf<TopMain>()
        val top1 = TopMain("1", "@drawable/iv_main_recycler1")
        val top2 = TopMain("2", "@drawable/iv_main_recycler1_2")
        val top3= TopMain("3", "@drawable/iv_main_recycler1_3")
        val top4 = TopMain("4", "@drawable/iv_main_recycler1_2")

        listTop.addAll(listOf(top1, top2, top3, top4))

        binding.rvTopMain.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)
        binding.rvTopMain.adapter = TopMainAdapter(requireContext(), listTop)

        val listCenter = arrayListOf<CenterMain>()
        val center1 = CenterMain("1", "@drawable/iv_c_recycler1")
        val center2 = CenterMain("2", "@drawable/iv_c_recycler1")
        val center3= CenterMain("3", "@drawable/iv_main_recycler1_3")
        val center4 = CenterMain("4", "@drawable/iv_main_recycler1_3")

        listCenter.addAll(listOf(center1, center2, center3, center4))

        binding.rvCenterMain.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)
        binding.rvCenterMain.adapter = TopCenterAdapter(requireContext(), listCenter)

        val listBottom = arrayListOf<BottomMain>()

        val bottommain1 = BottomMain("1", "@drawable/iv_c_recycler1", "Крепкий орешек", "Марафон к лету Комплекс")
        val bottommain2 = BottomMain("2", "@drawable/iv_c_recycler1", "Крепкий орешек", "Марафон к лету Комплекс")
        val bottommain3= BottomMain("3", "@drawable/iv_main_recycler1_3", "Крепкий орешек", "Марафон к лету Комплекс")
        val bottommain4 = BottomMain("4", "@drawable/iv_main_recycler1_3", "Крепкий орешек", "Марафон к лету Комплекс")

        listBottom.addAll(listOf(bottommain1, bottommain2, bottommain3, bottommain4))

        binding.rvBottomMain.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, true)
        binding.rvBottomMain.adapter = BottomMainAdapter(requireContext(), listBottom)
    }
}