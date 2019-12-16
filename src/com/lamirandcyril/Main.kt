package com.lamirandcyril

import com.lamirandcyril.model.Game

object
Main {
    @JvmStatic
    fun main(args: Array<String>) {

        val obj: Game = Game()
        val minVal = 1
        val maxVal = 10
        val input = obj.input()
        val rand = obj.choose(minVal,maxVal)
        var count: Int = 0
        var user: Int

        obj.header(minVal,maxVal)

        do {
            count++
            obj.message("input", "Try a number (Next line)")
            user = input.nextInt()
            obj.tryNumber(user,rand,count)
        } while(user != rand)
    }
}