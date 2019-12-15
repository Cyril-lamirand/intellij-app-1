package com.lamirandcyril;

import com.lamirandcyril.model.Product;
import com.lamirandcyril.model.SpecialNum;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World !");
        Product product = new Product("Keyboard");
        System.out.println(product.getName());
        SpecialNum specialnum = new SpecialNum();
        System.out.println(specialnum.getRoundNumber());

    }
}
