package com.example.beprojdummy.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.beprojdummy.R
import com.example.beprojdummy.databinding.FragmentEspDispBinding


class EspDispFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentEspDispBinding>(inflater, R.layout.fragment_esp_disp , container , false)


        val ipbox = binding.inputbox
        binding.connectipbutton.setOnClickListener{
            val text = ipbox.text

            Toast.makeText(requireActivity(), text.append(" is the IP Address of Network") , Toast.LENGTH_LONG).show()

        }


        binding.fetchbtn.setOnClickListener{
            it.findNavController().navigate(R.id.action_espDispFragment_to_dataDispFragment)
        }
        return binding.root



    }



}