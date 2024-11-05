package Firstlearningtutorial;

public class Audicar {

    public static void main(String[] args) {
        Myfirstcar audi= new Myfirstcar();
        audi.setcolor("green");
        audi.setsize(353);
        audi.setweight(90.58);
        audi.displaycar();

        Myfirstcar.accelarate();
        Myfirstcar.start();

        displaylogo("A");
        displaylogo( 35);

    }

    public static void displaylogo(String s1)
    {
        System.out.println("Logo is: " +s1);
    }
    public static void displaylogo(int s)
    {
        System.out.println("Logo is: " +s);
    }
}
