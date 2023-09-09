package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();

        double a[] = new double[12];


        for (int i = 0; i < a.length; i++) {

            // The question did not ask us for a random number, it was only done for better practice!

            a[i] = rand.nextDouble(10);
        }

        double small = a[0];
        for (int i = 0; i < a.length; i++){
            if( a[i]<small ){
                small = a[i];
            }
        }

        System.out.println( "Smallest element: " + small );
    }
}