package com.example.pilmobilebasics.mvp.model

import com.example.pilmobilebasics.mvp.contract.CountContract
import com.example.pilmobilebasics.util.Constants.ONE
import com.example.pilmobilebasics.util.Constants.ZERO

class CountModel : CountContract.Model {
    private var count = ZERO

    override fun getCount(): String = count.toString()

    override fun increase() {
        count += ONE
    }

    override fun reset() {
        count = ZERO
    }

    override fun decrease() {
        count -= ONE
    }
}