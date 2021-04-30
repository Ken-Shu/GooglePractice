package com.ken_shu.app_tiptime

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //tip_amount.text = "${get()}"

        context = this

    }

    //    fun get() : String{
//        var cost = cost_service.text.toString()
//        return cost
//    }
    fun OnClick(view: View) {


            var cost = cost_service.text.toString().toDouble()

                if (amazing.isChecked){cost = cost*0.2}
                if (good.isChecked){cost = cost*0.18}
                if (ok.isChecked){cost = cost*0.15}

            tip_amount.text = "${cost}"
        }
    }



