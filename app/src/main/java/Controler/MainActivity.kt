package Controler

import Utiletes.EXTRA_NUM
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.View
import android.widget.*
import androidx.annotation.IntegerRes
import androidx.core.content.contentValuesOf
import com.mujtaba.nbrasmeter.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.absoluteValue
import kotlin.properties.Delegates
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var widthText:EditText
    lateinit var hightText:EditText
    lateinit var m2View:TextView
    lateinit var btn_count:Button
    lateinit var totalView:TextView
    lateinit var  listShow : ScrollView
    var numList = arrayListOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        widthText =  findViewById(R.id.widthText)
        hightText = findViewById(R.id.hightText)
        m2View = findViewById(R.id.m2View)
        btn_count = findViewById(R.id.btn_count)
        totalView = findViewById(R.id.totalView)





       btn_count.setOnClickListener {
           //هنا نشرط عليه اذا كان الطول والعرض فاضي ف قيمته تكون 0
           if (widthText.text.toString().isEmpty()){
               widthText.setText(0)
           }
           if (hightText.text.toString().isEmpty()){
               hightText.setText(0)
           }
          ///////////////
           //هنا نربط الاشياء الب عندنا با(onCreate)
           val num1: Int = Integer.parseInt(widthText.text.toString())
           val num2:Int = Integer.parseInt(hightText.text.toString())
           var totalNum = Integer.parseInt(m2View.text.toString())



           //////////////
           //هنا سوينا المسائل الي نحتاجها
           val sum = num1*num2/100
           val numShow = sum
           val incase:Int = 100
           var sumToatal = numList.first()+numList.last()

           ///////////////////
           //هنا الست حقتنا الي تخزن الارقام فيها

           numList.add(sumToatal.toString())
           println(numList)





           ///////////////////
           //هذا الكود هو الي يطلع لنا الناتج ف (TextView)
           totalView.text = sumToatal.toString()
           //////////////////
           //هذا االرساله الصغيره الي تطلع ف البرنامج
           Toast.makeText(this@MainActivity,"$numList",Toast.LENGTH_LONG).show()

            //////////////////
           //هنا حطينا شرط
             if (sum>=100){
                 m2View.text= numShow.toString()
             }else{ m2View.text = incase.toString()

             }

       }


    }
            }


























