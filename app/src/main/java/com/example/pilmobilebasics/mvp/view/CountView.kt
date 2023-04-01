package com.example.pilmobilebasics.mvp.view

import android.app.Activity
import com.example.pilmobilebasics.databinding.ActivityMainBinding
import com.example.pilmobilebasics.mvp.contract.CountContract
import com.example.pilmobilebasics.mvp.view.base.ActivityView

class CountView(activity: Activity) : ActivityView(activity), CountContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun setCount(count: String) {
        binding.counterValue.text = count
    }

    override fun onIncreaseButtonPressed(onClick: () -> Unit) {
        binding.Increase.setOnClickListener {onClick()}
    }

    override fun onResetButtonPressed(onClick: () -> Unit) {
        binding.Reset.setOnClickListener {onClick()}
    }

    override fun onDecreaseButtonPressed(onClick: () -> Unit) {
        binding.Decrease.setOnClickListener {onClick()}
    }
}