package com.codeinventory.projecteuler;

public class P2 {

    public static void main(String... args) {

        int sum = 0;
        int fibo = 1;
        int fibo1 = 1;

        int result = 0;

        while (true) {

            sum = fibo + fibo1;

            if (sum > 4000000) {break;}

            fibo = fibo1;
            fibo1 = sum;

            if (sum % 2 == 0) {
                result += sum;
            }
            //System.out.println(sum);
        }

        System.out.println(result);
    }
}
