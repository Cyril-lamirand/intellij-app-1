package com.lamirandcyril

import com.lamirandcyril.model.Product
import com.lamirandcyril.model.SpecialNum

object Main {
    @JvmStatic
    fun main(args: Array<String>) { // write your code here
        println("Hello World !")
        val product = Product("Keyboard")
        println(product.name)
        val specialnum = SpecialNum()
        println(specialnum.roundNumber)
    }
}