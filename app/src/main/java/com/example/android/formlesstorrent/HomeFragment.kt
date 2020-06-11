package com.example.android.formlesstorrent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.formlesstorrent.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false)

        binding.searchButton.setOnClickListener {view: View ->
            view.visibility = View.GONE
            binding.searchField.visibility = View.VISIBLE
//            searchPopUp(it)
        }

        binding.searchButton.setOnClickListener {view: View ->
            binding.apply {
                searchField.visibility = View.GONE
                searchButton.visibility = View.GONE
            }
            view.findNavController().navigate(R.id.action_homeFragment_to_browserFragment)
        }
//        searchTorrents()
        return binding.root
    }


    }

//    private fun searchPopUp(view: View) {
//        view.visibility = View.GONE
//        binding.searchField.visibility = View.VISIBLE
//
//    }
    private fun searchTorrents(view: View) {
//        binding.apply {
//            searchField.visibility = View.GONE
//            searchButton.visibility = View.GONE
//
//        }


}