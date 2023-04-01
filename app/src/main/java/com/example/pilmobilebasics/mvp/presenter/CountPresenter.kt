package com.example.pilmobilebasics.mvp.presenter

import com.example.pilmobilebasics.mvp.contract.CountContract

class CountPresenter(private val model: CountContract.Model, private val view: CountContract.View) : CountContract.Presenter {

    init {
        view.onIncreaseButtonPressed { onIncreaseButtonPressed() }
        view.onResetButtonPressed { onResetButtonPressed() }
        view.onDecreaseButtonPressed { onDecreaseButtonPressed() }
    }

    override fun onIncreaseButtonPressed() {
        model.increase()
        view.setCount(model.getCount())
    }

    override fun onResetButtonPressed() {
        model.reset()
        view.setCount(model.getCount())
    }

    override fun onDecreaseButtonPressed() {
        model.decrease()
        view.setCount(model.getCount())
    }
}