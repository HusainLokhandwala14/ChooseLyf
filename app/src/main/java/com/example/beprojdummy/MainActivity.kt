package com.example.beprojdummy

import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.provider.Telephony
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.beprojdummy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val users = arrayOf(
        "Body Temperature : 97.1° F \n" + "SPo2 : 97%\n" + "Heart-Rate : 60 Bpm" ,
        "Body Temperature : 96.8° F \n" + "SPo2 : 96%\n" + "Heart-Rate : 79 Bpm" ,
        "Body Temperature : 98.1° F \n" + "SPo2 : 97%\n" + "Heart-Rate : 91 Bpm" ,
        "Body Temperature : 95.9° F \n" + "SPo2 : 98%\n" + "Heart-Rate : 71 Bpm" ,
        "Body Temperature : 97.1° F \n" + "SPo2 : 97%\n" + "Heart-Rate : 60 Bpm" ,
        "Body Temperature : 97.4° F \n" + "SPo2 : 96%\n" + "Heart-Rate : 69 Bpm" ,
        "Body Temperature : 96.6° F \n" + "SPo2 : 98%\n" + "Heart-Rate : 56 Bpm" ,
        "Body Temperature : 97.1° F \n" + "SPo2 : 97%\n" + "Heart-Rate : 60 Bpm" ,
        "Body Temperature : 98.3° F \n" + "SPo2 : 95%\n" + "Heart-Rate : 64 Bpm" ,
        "Body Temperature : 97.1° F \n" + "SPo2 : 97%\n" + "Heart-Rate : 83 Bpm" ,
        "Body Temperature : 97.7° F \n" + "SPo2 : 98%\n" + "Heart-Rate : 67 Bpm" ,
        "Body Temperature : 95.9° F \n" + "SPo2 : 98%\n" + "Heart-Rate : 79 Bpm" ,
        "Body Temperature : 98.9° F \n" + "SPo2 : 97%\n" + "Heart-Rate : 107 Bpm",
        "Body Temperature : 97.3° F \n" + "SPo2 : 97%\n" + "Heart-Rate : 87 Bpm"
    )

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        navController = this.findNavController(R.id.navControllerFragment)
        NavigationUI.setupActionBarWithNavController(this , navController)

val batanwifi = findViewById<Button>(R.id.wifibutton)

        batanwifi.setOnClickListener {
            if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.Q){
                val intent = Intent(Settings.Panel.ACTION_WIFI)
                startActivityForResult(intent , 1 )

            }
            else
            {
                val wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
                wifiManager.setWifiEnabled(true)

            }
        }







    }
}


