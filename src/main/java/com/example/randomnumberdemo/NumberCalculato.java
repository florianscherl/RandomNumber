package com.example.randomnumberdemo;

import java.util.Random;

public class NumberCalculato {

    public static int number(){
        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }

}
