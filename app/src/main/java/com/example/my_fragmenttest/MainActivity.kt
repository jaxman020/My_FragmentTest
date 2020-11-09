package com.example.my_fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    private lateinit var fmgr : FragmentManager
    private lateinit var f1 : F1Fragment
    private lateinit var f2 : F2Fragment
    private lateinit var f3 : F3Fragment
    private lateinit var f4 : F4Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fmgr = supportFragmentManager
        f1 = F1Fragment()
        f2 = F2Fragment()
        f3 = F3Fragment()
        f4 = F4Fragment()

        var transation = fmgr.beginTransaction()
        transation.add(R.id.container, f1)
        transation.commit()

    }

    fun setF1(view: View) {
        var transation = fmgr.beginTransaction()
        transation.replace(R.id.container, f1)
        transation.commit()
    }

    public fun getF1() : F1Fragment{
        return f1
    }

    fun setF2(view: View) {
        var transation = fmgr.beginTransaction()
        transation.replace(R.id.container, f2)
        transation.commit()
    }
    fun setF3(view: View) {
        var transation = fmgr.beginTransaction()
        transation.replace(R.id.container, f3)
        transation.commit()
    }
    fun setF4(view: View) {
        var transation = fmgr.beginTransaction()
        transation.replace(R.id.container, f4)
        transation.commit()
    }
}