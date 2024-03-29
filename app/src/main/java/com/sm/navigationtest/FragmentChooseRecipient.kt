package com.sm.navigationtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_choose_recipient.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentChooseRecipient : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_recipient, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnNext.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_next, null))

        btnNext.setOnClickListener {
            val recipientBundle = Bundle();
            recipientBundle.putString("nameArg",etName.text.toString())
            it.findNavController().navigate(R.id.action_next, recipientBundle)
        }
    }


}
