package com.example.app

import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var appBarConfiguration: AppBarConfiguration
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityMainBinding.inflate(layoutInflater)

    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)

    setContentView(binding.root)

    setSupportActionBar(binding.toolbar)

    val actionBar = supportActionBar

    actionBar?.setDisplayHomeAsUpEnabled(true)
    actionBar?.setHomeAsUpIndicator(R.drawable.ic_overflow)

    val navController = findNavController(R.id.content_main)
    appBarConfiguration = AppBarConfiguration(navController.graph)

    setupActionBarWithNavController(navController, appBarConfiguration)
  }

  // Required for the back / up button
  override fun onSupportNavigateUp(): Boolean {
    val navController = findNavController(R.id.content_main)
    return navController.navigateUp(appBarConfiguration)
        || super.onSupportNavigateUp()
  }
}