package com.kei.finalrecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        ll_already_member.setOnClickListener {
            val alreadyMemberIntent = Intent (this, SignInActivity::class.java)
            startActivity(alreadyMemberIntent)
        }
    }
}