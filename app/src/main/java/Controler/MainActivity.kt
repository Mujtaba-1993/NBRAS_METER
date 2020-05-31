package Controler

import Adapter.NbrassAdapteer
import Models.Numbers
import Servises.DataMyass
import Servises.DataMyass.numbers
import Utiletes.EXTRA_NUM
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.widget.*
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.recyclerview.widget.LinearLayoutManager

import com.mujtaba.nbrasmeter.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main2.view.*

open class MainActivity : AppCompatActivity() {
    lateinit var adapter: NbrassAdapteer
    val numLIst = arrayListOf("")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intent.getParcelableExtra<Numbers>(EXTRA_NUM)


       val widthText= findViewById<EditText>(R.id.widthText)
        val hightText = findViewById<EditText>(R.id.hightText)
        val m2View = findViewById<TextView>(R.id.m2View)











        adapter = NbrassAdapteer(this, DataMyass.numbers) {


        }





        val layoutManger = LinearLayoutManager(this)
        recycleNbras.layoutManager = layoutManger
        recycleNbras.adapter = adapter



    }
    fun btnCountClicked(view: View){
        val widthText = findViewById<EditText>(R.id.widthText)
        val hightText = findViewById<EditText>(R.id.hightText)
        val m2View = findViewById<TextView>(R.id.m2View)


        if (widthText.text.toString().isEmpty()){
            widthText.setText(0)
        }
        if (hightText.text.toString().isEmpty()){
            hightText.setText(0)
        }
        if (m2View.text.toString().isEmpty()){
            m2View.setText(0)
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
        val zero:Int = 0



        ///////////////////
        //هنا الست حقتنا الي تخزن الارقام فيها

        numLIst.add(sum.toString())
        println(numLIst)
        Toast.makeText(this,"$numLIst",Toast.LENGTH_LONG).show()



        ///////////////////
        //هذا الكود هو الي يطلع لنا الناتج ف (TextView)

        //////////////////
        //هذا االرساله الصغيره الي تطلع ف البرنامج


        //////////////////
        //هنا حطينا شرط
        if (sum in 1..100){
            m2View.text = incase.toString()


        }else if (sum==0){
            m2View.text = zero.toString()
        }else{
            m2View.text= numShow.toString()
        }
    }

    }


































































