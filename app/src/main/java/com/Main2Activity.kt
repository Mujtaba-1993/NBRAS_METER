package com

import Adapter.NbrassAdapteer
import Controler.MainActivity
import Servises.DataMyass
import Utiletes.EXTRA_NUM
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.mujtaba.nbrasmeter.R
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {
    lateinit var adapter: NbrassAdapteer
    lateinit var widthText: EditText
    lateinit var hightText: EditText
    lateinit var m2View: TextView
    lateinit var btn_count: Button
    lateinit var totalView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)









    }
}
