package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String newText = in.nextLine();
        newText = newText.trim();
        System.out.println("Количество слов в строке: " +newText.split("\\W+").length);
    }
}