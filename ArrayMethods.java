package Firstlearningtutorial;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {
        int arry1[]={9,5,7,3,8};
        int arry2[]={7,6,2,4,0};
        Arrays.sort(arry1);
        System.out.println("Length of the array:" +arry1.length);
        System.out.println("shorted array:" + Arrays.toString(arry1));

        if(arry1.equals(arry2)){
            System.out.println("array are equals");
        }
else {
            System.out.println("array are not equals");
        }
    }
}
