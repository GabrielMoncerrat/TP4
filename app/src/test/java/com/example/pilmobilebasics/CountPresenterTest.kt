package com.example.pilmobilebasics

import com.example.pilmobilebasics.mvp.contract.CountContract
import com.example.pilmobilebasics.mvp.model.CountModel
import com.example.pilmobilebasics.mvp.presenter.CountPresenter
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test

class CountPresenterTest {
    @MockK
    private lateinit var model: CountContract.Model
    private lateinit var view: CountContract.View
    private lateinit var presenter: CountContract.Presenter

    @Before
    fun setup() {
        MockKAnnotations.init(this, relaxed = true)
        model = CountModel()
        presenter = CountPresenter(CountModel(), view)
    }

    @Test
    fun onIncreaseButtonPressedTest(){

    }
}