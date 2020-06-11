package com.example.android.formlesstorrent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.android.formlesstorrent.databinding.FragmentBrowserBinding


class BrowserFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentBrowserBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_browser, container, false)
        return binding.root
    }



}