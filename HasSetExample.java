package Firstlearningtutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HasSetExample {

    public static void main(String[] args) {
        List<String> values =new ArrayList<>();
        values.add("java");
        values.add("c");
        values.add("php");
        values.add("c");
        values.add("php");

        HashSet<String> removeDuplicates = new HashSet<>();
        removeDuplicates.addAll(values);
        for(String s: removeDuplicates){
            System.out.println(s);
        }
    }
}
