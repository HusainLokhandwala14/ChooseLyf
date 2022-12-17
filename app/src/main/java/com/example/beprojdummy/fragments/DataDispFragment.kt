package com.example.beprojdummy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.beprojdummy.R
import com.example.beprojdummy.databinding.FragmentDataDispBinding


class DataDispFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
val binding = DataBindingUtil.inflate<FragmentDataDispBinding>(inflater , R.layout.fragment_data_disp , container , false)

        return binding.root
    }




}