package vn.edu.usth.weather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class WeatherActivity : AppCompatActivity () {
    init{
        Log.i("WeatherActivity", "Debug")
    }

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        Log.i("WeatherActivity", "onCreate")
    }
    @Override
    override fun onStart() {
        super.onStart()
        Log.i("WeatherActivity", "onStart")
    }

    @Override
    override fun onResume() {
        super.onResume()
        Log.i("WeatherActivity", "onResume")
    }

    @Override
    override fun onPause() {
        super.onPause()
        Log.i("WeatherActivity", "onPause")
    }

    @Override
    override fun onStop() {
        super.onStop()
        Log.i("WeatherActivity", "onStop")
    }

    @Override
    override fun onDestroy() {
        super.onDestroy()
        Log.i("WeatherActivity", "onDestroy")
    }
}


