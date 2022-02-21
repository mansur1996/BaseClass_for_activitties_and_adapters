package com.example.practice

interface BaseServer {
    companion object{
        val IS_TESTER = true
        val SERVER_DEVELOPMENT = "http://"
        val SERVER_DEPLOYMENT = "https://"
    }
}