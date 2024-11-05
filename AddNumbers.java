package Firstlearningtutorial;

public class AddNumbers {

    public static void main(String[] args) {

        addnumbers(5,5);
        addnumbers(3,7);
        addnumbers(2,8);
        addnumbers(1,9);
        int result=addnumbers(6,6);
        int output=result +5;
        System.out.println("increment the output" + output);
    }

    public static int addnumbers(int num1, int num2) {

        int res=num1+num2;
        System.out.println("Addition of 2 numbers is: " +res);
        return res;

    }
}
