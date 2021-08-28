package com.example.sms_sherlar

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.navigation.Navigation
import com.example.sms_sherlar.Models.loadData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        smsDialog(this)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        loadData()
    }
    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_navigation_host).navigateUp()
    }

    companion object dialogShow {
        lateinit var dialog: AlertDialog
        fun smsDialog(context: Context) {
            val alertDialog = AlertDialog.Builder(context)
            dialog = alertDialog.create()

            val dialogView = LayoutInflater.from(context).inflate(R.layout.item_dialog_sms_logo, null, false)
            dialog.setView(dialogView)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            dialog.show()
            SmsDialog().start()
        }
        fun dialogCancel(){
            dialog.cancel()
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        }
    }
}

class SmsDialog():Thread(){
    override fun run() {
        super.run()
        sleep(2000)
        MainActivity.dialogShow.dialogCancel()
    }
}