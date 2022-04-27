package com.example.travel.ui.fragment

import androidx.fragment.app.Fragment
import com.example.travel.arch.AttractionsViewModel
import com.example.travel.ui.MainActivity

abstract class BaseFragment: Fragment() {

    protected val navController by lazy {
        (activity as MainActivity).navController
    }

    protected val activityViewModel: AttractionsViewModel
        get() = (activity as MainActivity).viewModel
}