package com.example.pilmobilebasics.mvp.model

import com.example.pilmobilebasics.mvp.contract.CountContract
import com.example.pilmobilebasics.util.Constants.One
import com.example.pilmobilebasics.util.Constants.Zero

class CountModel : CountContract.Model {
    private var count = Zero

    override fun getCount(): String = count.toString()

    override fun increase() {
        count += One
    }

    override fun reset() {
        count = Zero
    }

    override fun decrease() {
        count -= One
    }
}