package Firstlearningtutorial;

import java.util.HashMap;

public class HashmapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> language = new HashMap<>();
        language.put(1, "java");
        language.put(2,"c");
        language.put(3,"php");
        System.out.println(language);

        if(language.containsKey(1)){
            System.out.println(language.get(1));
        }
        if(!language.isEmpty()){
            System.out.println("Hashmap contains mappings");
        }
        language.remove(3);
            System.out.println(language);

    }
}
