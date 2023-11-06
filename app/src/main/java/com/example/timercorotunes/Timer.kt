package com.example.timercorotunes

import kotlinx.coroutines.*

private suspend fun main() {
    runBlocking {
        val stopwatchJob = launch {
            for (i in 1..60) {
                delay(1000)
                println("прошло $i секунд")
            }
        }
        val startTime = launch {
            val timeToWait = 5000L
            delay(timeToWait)
            println(" $timeToWait миллисекунд прошло.")
        }

        stopwatchJob.join()
        startTime.join()
    }
}





