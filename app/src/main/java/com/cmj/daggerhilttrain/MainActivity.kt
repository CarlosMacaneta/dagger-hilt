package com.cmj.daggerhilttrain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.dialog.MaterialDialogs
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint // when injecting something with dagger-hilt
class MainActivity : AppCompatActivity() {

    @Inject // will inject the provided string in AppModule
    @Named("fun1")
    lateinit var test: String

    val testViewModel: TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t = test
        testViewModel.testWord.observe(this) {
            MaterialAlertDialogBuilder(this)
                .setMessage(it)
                .setCancelable(false)
                .setPositiveButton("OK") { _, _ -> }
                .show()
        }
    }
}