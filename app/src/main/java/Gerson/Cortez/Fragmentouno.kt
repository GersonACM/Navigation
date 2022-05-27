package Gerson.Cortez

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Fragmentouno : Fragment(){

    lateinit var botonUno: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vistaUno=inflater.inflate(R.layout.fragmentouno, container, false)
        botonUno = vistaUno.findViewById(R.id.button2)
        botonUno.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentoUno_to_fragmentoDos)
        }
        return vistaUno
    }
}