package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.println("You asked me: " + question);
        int random = new Random().nextInt(3);
        if (random == 0) {
            System.out.println("Yes");
        } else if (random == 1) {
            System.out.println("No");
        } else {
            System.out.println("Maybe");
        }
    }
}
