package com.sm.navigationtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentMain : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnChooseRecipient.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_ChooseRecipient, null))
        btnViewBalance.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_ViewBalance, null))
        btnViewTransaction.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_Transaction, null))
    }


}
