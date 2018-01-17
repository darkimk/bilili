package com.darkimk.bilili

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var vm: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vm = ViewModelProviders.of(this).get(TestViewModel::class.java)
        vm.getCurrentData().observe(this, Observer {
            tv_value.text = it?.name
        })
        vm.getTestData().observe(this, Observer {
            tv_count.text = it?.size?.toString()
        })
        ev_input.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                vm.getCurrentData().value?.name = p0?.toString()
            }

        })
        btn.setOnClickListener {
            vm.test()
        }
    }

}
