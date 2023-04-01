package com.example.pilmobilebasics.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pilmobilebasics.mvp.model.CountModel
import com.example.pilmobilebasics.mvp.presenter.CountPresenter
import com.example.pilmobilebasics.mvp.view.CountView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CountPresenter(CountModel(), CountView(this))
    }
}