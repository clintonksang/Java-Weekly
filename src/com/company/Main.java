package com.company;

public class Main {

    public static void main(String[] args) {
//        EXERCISE 1 BEER SONG

//        int beerNum = 99;
//        String word = "bottles";
//        while (beerNum > 0) {
//            if (beerNum == 1) {
//                word = "bottle"; // singular, as in ONE bottle.
//            }
//            System.out.println(beerNum +  word +  "of beer on the wall");
//            System.out.println(beerNum +  word +  "of beer");
//            System.out.println("Take one down");
//            System.out.println("Pass it around");
//            beerNum = beerNum - 1;
//
//            if (beerNum > 0) {
//                System.out.println(beerNum +  word +  "of beer on the wall");
//            } else {
//                System.out.println("No more bottles of beer on the wall");
//            }
//        }

//        EXERCISE 2
//   int x = 3;

//    while (x>0){
//
//
//        if (x > 2){
//            System.out.print("a");
//        }
//         x = x - 1;
//        System.out.print("-");
//        if (x == 2) {
//            System.out.print("b c");
//        }
//        if (x == 1) {
//            System.out.print("d");
//            x = x - 1;
//        }
//    }

//        EXERCISE 3 Match the outputs
//        A short Java program is listed below. One block of the program
//        is missing. Your challenge is to match the candidate block of
//        code (on the left), with the output that you’d see if the block
//        were inserted. Not all the lines of output will be used, and some
//        of the lines of output might be used more than once. Draw lines
//        connecting the candidate blocks of code with their matching
//        command-line output. (The answers are at the end of the chapter).

        int x = 0;
        int y = 0;
        while ( x < 5 ) {

//            code here
            y  = x - y;   // candidate

            System.out.print(x + "" + y +" ");
            x = x + 1;
        }
//        _______________________________________________________
//   A     y = y + 2;
//        if( y > 4 ) {                     22 46
//            y = y - 1;
//        }

//   B
//        x = x + 1;
//        y = y + x;                        11 34 59

//   C
//        if ( y < 5 ) {
//            x = x + 1;
//            if ( y < 3 ) {                02 14 36 48
//                x = x - 1;
//            }
//        }
//        y = y + 2;                        02 14 36 48

//  D
//        y = y + x;                        02 14 36 48
    }
}
