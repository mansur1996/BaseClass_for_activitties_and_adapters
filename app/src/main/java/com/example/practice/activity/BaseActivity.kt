package com.example.practice.activity

import androidx.appcompat.app.AppCompatActivity
import com.example.practice.BaseServer
import com.example.practice.model.Item

open class BaseActivity : AppCompatActivity() {

    protected fun getServer() : String{
        return if(BaseServer.IS_TESTER) return BaseServer.SERVER_DEVELOPMENT
        else BaseServer.SERVER_DEPLOYMENT
    }

    protected fun isEmpty(s : String?) : Boolean{
        return s == null || s.trim { it <= ' ' }.isEmpty()
    }

    protected fun preparedItemList() : ArrayList<Item>{
        val items  : ArrayList<Item> = ArrayList()

        for(i in 0..15) items.add(Item("Item$i"))

        return items
    }
}