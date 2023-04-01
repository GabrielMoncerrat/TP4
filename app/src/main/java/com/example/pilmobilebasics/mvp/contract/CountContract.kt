package com.example.pilmobilebasics.mvp.contract

interface CountContract {
    interface Model {
        fun getCount(): String
        fun increase()
        fun reset()
        fun decrease()
    }

    interface View {
        fun setCount(count: String)
        fun onIncreaseButtonPressed(onClick: () -> Unit)
        fun onResetButtonPressed(onClick: () -> Unit)
        fun onDecreaseButtonPressed(onClick: () -> Unit)
    }

    interface Presenter {
        fun onIncreaseButtonPressed()
        fun onResetButtonPressed()
        fun onDecreaseButtonPressed()
    }
}