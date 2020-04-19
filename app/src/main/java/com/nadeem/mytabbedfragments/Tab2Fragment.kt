package com.nadeem.mytabbedfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.tab1_fragment.*
import kotlinx.android.synthetic.main.tab2_fragment.*
import java.util.zip.Inflater

class Tab2Fragment : Fragment() {

    companion object{
        fun Tab2newInstance(): Tab2Fragment{
            return  Tab2Fragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tab2_fragment,container,false)

button2.setOnClickListener{
Toast.makeText(activity,"Button2 Clicked",Toast.LENGTH_LONG).show()

}
        return  view
    }
}