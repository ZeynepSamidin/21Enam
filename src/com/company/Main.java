package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DayofTheWeek dayofTheWeek = DayofTheWeek.valueOf(scanner.nextLine());

        switch (dayofTheWeek) {
        case DUYSHOMBY -> System.out.println("Дуйшомбу Java окуйм");
        case SHEYSHEMBI -> System.out.println("English болот анан практика");
        case SHARSHEMBI -> System.out.println("Шаршемби java окуйм...");
        case BEYSHEMBI -> System.out.println("Soft skil cfmfus ,болот + практика");
        case JUMA -> System.out.println("Juma kunu Java bolot");
        case ISHEMBI -> System.out.println("sesion praktic");
        case JEKSHEMBI -> System.out.println("Наконец-то выходной))))");

        }
    }
}
