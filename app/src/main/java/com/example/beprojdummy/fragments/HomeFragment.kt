package com.example.beprojdummy.fragments

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context.WIFI_SERVICE
import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.beprojdummy.R
import com.example.beprojdummy.databinding.FragmentHomeBinding
import android.app.Application
import android.content.Context

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater ,
            R.layout.fragment_home , container , false)


        binding.connectButton.setOnClickListener{
            it.findNavController().navigate(R.id.action_homeFragment2_to_espDispFragment)
        }
        return binding.root





    }



}