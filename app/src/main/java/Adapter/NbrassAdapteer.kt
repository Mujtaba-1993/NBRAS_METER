package Adapter

import Controler.MainActivity
import Models.Numbers
import Utiletes.EXTRA_NUM
import android.content.Context
import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.mujtaba.nbrasmeter.R
import kotlinx.android.synthetic.main.activity_main.view.*


 open class NbrassAdapteer(val context: Context, val numbers:List <Numbers>,val itemClick:(Numbers)-> Unit ):RecyclerView.Adapter<NbrassAdapteer.Holder>(){

   open inner class Holder (itemView: View, val itemClick: (Numbers) -> Unit):RecyclerView.ViewHolder(itemView){
      val widthText = itemView.findViewById<EditText>(R.id.widthText)
      val hightText = itemView.findViewById<EditText>(R.id.hightText)
      val m2View = itemView.findViewById<TextView>(R.id.m2View)
       val btnCount = itemView.findViewById<Button>(R.id.btnCount)
        val numLIst = arrayListOf("")
       val intent = Intent(context,MainActivity::class.java)



         fun bindNumbers (context:Context, numbers:Numbers){
           btnCount?.setOnClickListener { itemClick(numbers) }
             intent.putExtra(EXTRA_NUM,numbers)




            btnCount?.setOnClickListener {



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
                Toast.makeText(context,"$numLIst",Toast.LENGTH_LONG).show()



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


        }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
      val view = LayoutInflater.from(context).inflate(R.layout.activity_main2,parent,false)
        return Holder(view,itemClick)


    }

    override fun getItemCount(): Int {
        return numbers.count()


    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.bindNumbers(context,numbers[position])

    }


}



