package com.codeinventory.projecteuler;

import java.util.Collections;
import java.util.HashSet;

public class P3 {

    public static void main(String... args) {

        long input = 600851475143L;
        HashSet<Integer> set = new HashSet<Integer>();

        while( input % 2 == 0) {
            input = input / 2;
        }

        for (int i = 3; i< Math.sqrt(input);i = i +2) {

            while(input % i == 0) {
                input = input / i;
                set.add(i);
            }
        }

        if (input > 2) {
            set.add(new Long(input).intValue());
        }

        System.out.println(Collections.max(set));

    }
}
