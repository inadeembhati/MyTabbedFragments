package com.nadeem.mytabbedfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.tab1_fragment.*
import java.util.zip.Inflater

class Tab3Fragment : Fragment() {


    companion object{
        fun Tab3newInstance(): Tab3Fragment{
            return  Tab3Fragment()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tab3_fragment,container,false)

button1.setOnClickListener{
Toast.makeText(activity,"Button3 Clicked",Toast.LENGTH_LONG).show()

}
        return  view
    }
}