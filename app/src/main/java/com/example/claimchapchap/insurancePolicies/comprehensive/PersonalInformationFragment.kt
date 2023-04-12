package com.example.claimchapchap.insurancePolicies.comprehensive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentComprehensivePersonalInformationBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class PersonalInformationFragment : Fragment() {

    private lateinit var binding: FragmentComprehensivePersonalInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentComprehensivePersonalInformationBinding.inflate(layoutInflater)
        val view = binding.root

        val next: Button = binding.btnNext


        return view
    }

}