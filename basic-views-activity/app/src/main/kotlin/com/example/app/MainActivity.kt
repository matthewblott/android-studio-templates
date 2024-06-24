package com.example.app

import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
    setContentView(binding.root)

//    val supportActionBar = supportActionBar
//    supportActionBar?.setDisplayHomeAsUpEnabled(true)
//    binding.toolbar.navigationIcon?.setColorFilter(1, PorterDuff.Mode.SRC_IN)
//    binding.toolbar.navigationIcon?.mutate()?.setColorFilter(1, PorterDuff.Mode.SRC_IN)

    setSupportActionBar(binding.toolbar)

//    actionBar?.setHomeAsUpIndicator(R.drawable.ic_overflow);
    val actionBar = getSupportActionBar()

    actionBar?.setDisplayHomeAsUpEnabled(true)
    actionBar?.setHomeAsUpIndicator(R.drawable.ic_overflow)

    val navController = findNavController(R.id.content_main)
    appBarConfiguration = AppBarConfiguration(navController.graph)

    setupActionBarWithNavController(navController, appBarConfiguration)
  }

  override fun onSupportNavigateUp(): Boolean {
    val navController = findNavController(R.id.content_main)
    return navController.navigateUp(appBarConfiguration)
        || super.onSupportNavigateUp()
  }
}