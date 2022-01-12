package com.example.excercise01

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.example.excercise01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Check", "onCreate")

        title = "Activity"

        val activity: FragmentActivity = this
        val factory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory()

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).apply {
            lifecycleOwner = this@MainActivity
            viewModel = ViewModelProvider(activity, factory).get(Text::class.java)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Check", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Check", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Check", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Check", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Check", "onDestroy")
    }

    companion object {
        private const val TEXT_STATE = "text_state"
    }
}