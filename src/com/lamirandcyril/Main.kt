package com.lamirandcyril

import com.lamirandcyril.model.Game
import java.util.*
import kotlin.io.readLine

object
Main {
    @JvmStatic
    fun main(args: Array<String>) {

        val obj: Game = Game()
        var gm: Int
        var case: Int

        obj.header()
        obj.message("dialog","Choose your gamemode, press [1] 2 Players or [2] Solo ")
        gm = obj.input().nextInt()
        case = gm

        when (case) {
            1 -> Players()
            2 -> Machine()
            else -> obj.message("debug","An error happening")
        }
    }

    private fun Machine() {

        val obj = Game()
        val minVal = 1
        val maxVal = 100
        val input = obj.input()
        val rand = obj.choose(minVal,maxVal)

        var count: Int = 0
        var user: Int

        obj.message("dialog","[Computer] is choosing number between $minVal and $maxVal")
        obj.message("dialog","[GAME START] It's your turn now !")
        do {
            count++
            obj.message("input", "Try a number (Next line)")
            user = input.nextInt()
            obj.tryNumber(user,rand,count)
        } while(user != rand)
    }

    private fun Players() {

        val obj = Game()
        val reader = obj.input()

        var player1: Int
        var player2: Int
        var count: Int = 0

        obj.message("dialog","[Player-1] Write a number between 1 and 100")

        player1 = reader.nextInt()
        obj.message("dialog","[Player-1] Thank you, it's Player 2 turn now.")
        do {
            count++
            obj.message("input", "[Player-2] Try a number (Next line)")
            player2 = reader.nextInt()
            when {
                player2 > player1 -> obj.message("result","It's less !")
                player2 < player1 -> obj.message("result","It's more !")
                player2 == player1 -> obj.message("result","You find the number ! $count Attempts, well done.")
            }
        } while(player2 != player1)
    }
}