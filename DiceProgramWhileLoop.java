package Firstlearningtutorial;

import java.util.Arrays;
import java.util.Scanner;

public class DiceProgramWhileLoop
{

    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        while(number<10){
if(number >6){
    System.out.println("you win the game");
        }
else{
    System.out.println("you loose the game");

}
}}}
