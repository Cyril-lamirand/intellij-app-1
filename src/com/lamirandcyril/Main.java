package com.lamirandcyril;

import com.lamirandcyril.model.Product;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Hello World !");
        Product product = new Product("Keyboard");
        System.out.println(product.getName());
        number();
    }

    public static void number() {

        double randomNumber = Math.random();
        String randomNumber2 = String.valueOf(Math.round(randomNumber));
        System.out.println(randomNumber2);

    }
}
