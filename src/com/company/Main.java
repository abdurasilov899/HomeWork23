package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> randomnyiSifry = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int a = (random.nextInt(100));
            randomnyiSifry.add(a);
            if (a % 2 == 0) {
                oddNumber.add(a);
            } else {
                evenNumber.add(a);
            }
        }
        System.out.println("Radmom numbers " + randomnyiSifry);
        System.out.println("Odd numbers " + oddNumber + "\n"
                + "Even numbers" + evenNumber);

    }
}
