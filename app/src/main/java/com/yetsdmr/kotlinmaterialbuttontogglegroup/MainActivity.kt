package com.yetsdmr.kotlinmaterialbuttontogglegroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        materialButtonToggleGroup.addOnButtonCheckedListener {
                group, checkedId, isChecked ->

            val listenerButton: MaterialButton = group.findViewById(checkedId)
            val checkedButton: MaterialButton? = group.findViewById(group.checkedButtonId)

            if (checkedButton!=null){
                textView.text = "Checked : ${checkedButton.text}"
                if (!isChecked){
                    textView.append("\nBy uncheck : ${listenerButton.text} ")
                }
            }else{
                textView.text = "Checked : Nothing"
                if (!isChecked){
                    textView.append("\nBy Uncheck : ${listenerButton.text} ")
                }
            }
        }
    }
}