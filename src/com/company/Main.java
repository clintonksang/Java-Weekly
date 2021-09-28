package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            System.out.println(beerNum +  word +  "of beer on the wall");
            System.out.println(beerNum +  word +  "of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;
        }
    }
}
