package com.mykotlinapplication.kotlin21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentTwo: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_two, container, false)

        var str = arguments!!.getString("name")

        view.textView_welcome.setText("Welcome, ${str}!")


        return view
    }
}