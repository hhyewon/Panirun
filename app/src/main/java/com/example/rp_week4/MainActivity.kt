package com.example.rp_week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.example.rp_week4.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mainTextChangeArrayList= ArrayList<Int>()

        var handler =Handler(Looper.getMainLooper())
        mainTextChangeArrayList.add(R.drawable.main_text)
        mainTextChangeArrayList.add(R.drawable.main_text2)
        mainTextChangeArrayList.add(R.drawable.main_text3)
        mainTextChangeArrayList.add(R.drawable.main_text4)
        mainTextChangeArrayList.add(R.drawable.main_text5)
        mainTextChangeArrayList.add(R.drawable.main_text6)

        Thread(){
//            while ()
                for(i in mainTextChangeArrayList) {
                Thread.sleep(300)
                handler.post {
                    binding.mainTxt.setImageResource(i)
                }
            }
//            for(i in mainTextChangeArrayList){
//                Thread.sleep(300)
//                handler.post{
//                    binding.mainTxt.setImageResource(i)
//                }
//            }
        }.start()

    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        }
    }
}