package com.mykotlinapplication.kotlin21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_one, container, false)

        view.button.setOnClickListener(View.OnClickListener {
            val fragmentTwo = FragmentTwo()
            val bundle = Bundle()

            bundle.putString("name", editText_name.text.toString())
            fragmentTwo.arguments = bundle


            fragmentManager!!.beginTransaction().replace(R.id.main_Fragment, fragmentTwo).commit()
        })

        return view
    }

}