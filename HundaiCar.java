package Firstlearningtutorial;

public class HundaiCar extends Myfirstcar{

    public static void main(String[] args) {
        start();
        accelarate();
        breaks();
    }
    public static void breaks(){
        System.out.println("press the breaks");
    }


   public static void start(){
        String Key="on";
       System.out.println("Turn the keys " +Key);
   }
}
