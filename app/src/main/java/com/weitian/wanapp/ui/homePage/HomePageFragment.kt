package com.weitian.wanapp.ui.homePage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.weitian.wanapp.databinding.FragmentHomepageBinding

class HomePageFragment :Fragment(){
    private lateinit var viewModel: HomePageViewModel
    private var _binding:FragmentHomepageBinding? = null
    private val binding get() =_binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {
        _binding= FragmentHomepageBinding.inflate(inflater,container,false)
        val view=binding.root

        // init viewModel
        viewModel=ViewModelProvider(this).get(HomePageViewModel::class.java)
        val tvObserver=Observer<String>{response->
            binding.tvBbs.text=response
        }
        viewModel.response.observe(viewLifecycleOwner,tvObserver)

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}