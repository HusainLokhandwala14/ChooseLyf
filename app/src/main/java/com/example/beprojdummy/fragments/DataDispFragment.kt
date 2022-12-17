package com.example.beprojdummy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.databinding.DataBindingUtil
import com.example.beprojdummy.R
import com.example.beprojdummy.databinding.FragmentDataDispBinding
import kotlin.random.Random


class DataDispFragment : Fragment() {
    private val templist : MutableList<String> = mutableListOf("96.7" , "211133", "999", "98" ,"99")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentDataDispBinding>(
            inflater,
            R.layout.fragment_data_disp, container, false
        )


        return binding.root



    }





}