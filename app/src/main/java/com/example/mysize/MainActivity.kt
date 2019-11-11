package com.example.mysize

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.core.content.edit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        save.setOnClickListener {onSaveTapped()}

        heightButton.setOnClickListener{
            val intent = Intent(this, HeightActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        val pref = PreferenceManager.getDefaultSharedPreferences(this);
        val editNeck = pref.getString("NECK","")
        val editSleeve = pref.getString("SLEEVE","")
        val editWaist = pref.getString("WAIST","")
        val editInseam = pref.getString("INSEAM","")


        neck.setText(editNeck);
        sleeve.setText(editSleeve);
        waist.setText(editWaist);
        inseam.setText(editInseam);

        save.setOnClickListener(OnSaveTapped())

        //身長アイコンボタンをクリック時の画面推移の設定
        heightButton.setOnClickListener{
            val intent = Intent(this,HeightActivity::class.java);
            this.startActivity(intent)
        }


    }
    private fun OnSaveTapped(){
        val pref = PreferenceManager.getDefaultSharedPreferences(this);
        pref.edit{
            this.putString("NECK",neck.text.toString())
            this.putString("SLEEVE",sleeve.text.toString())
            this.putString("WAIST",waist.text.toString())
            this.putString("INSEAM",inseam.text.toString())

        }
    }

}