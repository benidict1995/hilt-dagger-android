package com.benidict.core.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewBinding>(
    private val setupViewBinding: (LayoutInflater) -> VB
): AppCompatActivity(){

    lateinit var viewBinding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = setupViewBinding(layoutInflater)
        setContentView(viewBinding.root)

        loadContent()
        setupView()
    }

    open fun loadContent(){}
    open fun setupView(){}
}