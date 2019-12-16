package com.lamirandcyril.model

import java.util.*

class Game {

    fun main(args: Array<String>){

    }

    fun header(minVal: Int, maxVal: Int) {
        println("[STARTING] Run : IntelliJ-APP-1")
        this.message("dialog","---------------- ----------------------- ------------------")
        this.message("dialog","---------------- ---[FIND THE NUMBER]--- ------------------")
        this.message("dialog","---------------- ----------------------- ------------------")
        this.message("dialog","Computer : I'm thinking about a number between $minVal and $maxVal...")
        this.message("dialog","Computer : Let's start the game !")
    }

    fun tryNumber(user: Int, rand: Int, count: Int) {
        val num1 = user
        val num2 = rand
        val num3 = count
        when{
            num1 > num2 -> this.message("result", "It's less !")
            num1 < num2 -> this.message("result", "It's more !")
            num1 == num2 -> this.message("result", "You find the number ! $num3 Attempts, well done.")
        }
    }

    fun choose(minVal: Int, maxVal:Int): Int{
        val min = minVal
        val max = maxVal
        val random = SplittableRandom()
        // this.message("debug","Number is choose !")
        return random.nextInt(minVal, maxVal)
    }

    fun message(type: String, text: String) {
        if (type == "debug") {
            println("[DEBUG] $text")
        } else if (type == "dialog") {
            println("[DIALOG] $text")
        } else if (type == "result") {
            println("[RESULT] $text")
        }else if (type == "input") {
            println("[INPUT] $text")
        } else {
            println("[ERROR] Something Wrong !")
        }
    }

    fun input(): Scanner {
        val read = Scanner(System.`in`)
        return read
    }

}