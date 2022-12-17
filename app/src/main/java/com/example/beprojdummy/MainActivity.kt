package com.example.beprojdummy

import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.provider.Telephony
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.beprojdummy.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivity : AppCompatActivity() {


    private val templist : MutableList<String> = mutableListOf("96.7" , "211133", "999", "98" ,"99")


    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController = this.findNavController(R.id.navControllerFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)

        val batanwifi = findViewById<Button>(R.id.wifibutton)

        batanwifi.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val intent = Intent(Settings.Panel.ACTION_WIFI)
                startActivityForResult(intent, 1)

            } else {
                val wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
                wifiManager.isWifiEnabled = true

            }
        }




      //databtn.setOnClickListener{
        //  val randInt = Random.nextInt(100)
          //mybdtemp.setText("$randInt  F")
      //}

//        val myrandInt = Random.nextInt(100)
//        val mytempval = findViewById<TextView>(R.id.tempval)
//        mytempval.text = "$myrandInt F"

        generateNum()


    }
    private val mybdtemp = findViewById<TextView>(R.id.tempval) as TextView

     private fun generateNum(){

        mybdtemp.setOnClickListener{
            val random : Int = (0 until (templist.size)).random()
            mybdtemp.text=templist[random]
        }
    }
}



