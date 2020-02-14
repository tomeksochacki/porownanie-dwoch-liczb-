package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Podaj liczbę całkowitą nr 1:");
        Scanner scanner1 = new Scanner(System.in);

        int liczbacałkowitanr1 = scanner1.nextInt();

        System.out.println("Podaj liczbę całkowitą nr 2: ");

        Scanner scanner2 = new Scanner(System.in);

        int liczbacałkowitanr2 = scanner2.nextInt();


        if (liczbacałkowitanr1 > liczbacałkowitanr2) {
            System.out.println("Liczba całkowita nr 1 jest liczbą większą od liczby całkowitej nr 2 :" + liczbacałkowitanr1 + ">" + liczbacałkowitanr2);
        }
        if (liczbacałkowitanr1 < liczbacałkowitanr2) {
            System.out.println("Liczba całkowita nr 1 jest liczbą mniejszczą od liczby całkowitej nr 2 : " + liczbacałkowitanr1 + "<" + liczbacałkowitanr2);
        }

    }
}
