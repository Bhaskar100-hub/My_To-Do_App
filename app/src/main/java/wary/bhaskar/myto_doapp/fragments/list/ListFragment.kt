package wary.bhaskar.myto_doapp.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import wary.bhaskar.myto_doapp.R
import wary.bhaskar.myto_doapp.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list) {

    private lateinit var binding: FragmentListBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate((R.id.action_listFragment_to_addFragment))
        }

        binding.listLayout.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_updateFragment)
        }
    }
}


