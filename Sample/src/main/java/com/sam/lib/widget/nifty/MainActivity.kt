package com.sam.lib.widget.nifty

import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.setOnClickListener {

            showNiftyNotification("哈哈哈哈 嘿嘿嘿嘿")
        }
    }

    fun showNiftyNotification(msg: String) {
        val cfg = Configuration.Builder().setAnimDuration(100).setDispalyDuration(300)
            .setBackgroundColor("#F86161").setTextColor("#FFFFFF")
            .setIconBackgroundColor("#FFFFFFFF").setTextPadding(15)
            .setViewHeight(50 + 30)
            .setTextSize(20f).setTextLines(2).setTextGravity(
                Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL
            ).build()
        NiftyNotificationView.build(
            this,
            msg,
            Effects.standard,
            R.id.msg_container,
            cfg
        ).show()
    }

}
