package com.example.my_fragmenttest

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [F1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class F2Fragment : Fragment() {
    private lateinit var mainView: View
    private lateinit var mainActivity: MainActivity

    private var param1: String? = null
    private var param2: String? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mainActivity = context as MainActivity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mainView =inflater.inflate(R.layout.fragment_f2, container, false)

        var f2btn = mainView.findViewById<Button>(R.id.f2btn)
        f2btn.setOnClickListener {
            test1()
        }
        return mainView
    }

    private fun test1() {
        Log.v("UJ", "Click")
        mainActivity.getF1().setMesg("Lottery:" + (1..49).random())
    }

}