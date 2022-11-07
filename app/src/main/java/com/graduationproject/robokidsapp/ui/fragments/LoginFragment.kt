package com.graduationproject.robokidsapp.ui.fragments

import android.content.Context
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.graduationproject.robokidsapp.R
import com.graduationproject.robokidsapp.databinding.FragmentLoginBinding
import com.graduationproject.robokidsapp.databinding.FragmentRegisterBinding

class LoginFragment : Fragment() {
    private lateinit var mNavController: NavController
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mNavController = findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.tvSignUp.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            mNavController.navigate(action)
        }

        binding.forgetPasswordBlock.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToForgotPasswordFragment()
            mNavController.navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}