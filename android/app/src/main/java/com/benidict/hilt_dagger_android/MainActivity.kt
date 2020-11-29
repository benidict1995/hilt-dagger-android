package com.benidict.hilt_dagger_android

import androidx.activity.viewModels
import com.benidict.core.base.BaseActivity
import com.benidict.core.utils.showToast
import com.benidict.hilt_dagger_android.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(
    ActivityMainBinding::inflate
){

    private val viewModel: MainViewModel by viewModels()

    override fun loadContent() {
        super.loadContent()
        showToast(viewModel.loadTestData())
    }

}