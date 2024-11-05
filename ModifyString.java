package Firstlearningtutorial;

public class ModifyString {
    public static void main(String[] args) {
        String s1="First learning";
        String s2="Java for automation";
        String s3= "lowercase to uppercase";
        String s4= "UPPERCASE TO LOWERCASE";

        System.out.println("Length of the string is: " + s1.length());
        System.out.println("Upper case the string:" + s3.toUpperCase());
        System.out.println("Lower case the string:" + s4.toLowerCase());
        System.out.println("Get Char:" +s2.indexOf("m"));
        System.out.println("Get position:" + s2.charAt(13));
    }
}
