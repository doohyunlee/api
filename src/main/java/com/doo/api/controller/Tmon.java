package com.doo.api.controller;

import java.util.Arrays;

public class Tmon {


    public static void main(String[] args) {


        int number = 15;


        int count = 0;
        while (number > 0)
        {
            if ((number % 2 ) == 1){
                count++;
            }
            number = number / 2;
        }

//        return count;
        System.out.println(count);

//        return s;



    }


//    public static void main(String[] args) {
//
//
//        int searchPrice = 100;
//
//        int[] ints = new int[10];
//        ints[0] = 100;
//        ints[1] = 200;
//
//        int index = Arrays.binarySearch(ints, searchPrice);
//
//
//        System.out.println(index);
//
//
//
//    }
}
