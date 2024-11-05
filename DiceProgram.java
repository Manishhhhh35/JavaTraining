package Firstlearningtutorial;

import java.util.Scanner;

public class DiceProgram {

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 6) {
            System.out.println("you win");
        } else {
            System.out.println("you loose");
        }
    }
}