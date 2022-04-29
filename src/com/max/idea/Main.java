package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Input current exchange rate:");
        double rate = inp.nextDouble();
        System.out.println("\nInput number of rubles:");
        double rub = inp.nextDouble();

        System.out.printf("In dollars: %.2f", rub/rate);
    }
}