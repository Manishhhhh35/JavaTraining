package Firstlearningtutorial;

public class Myfirstcar {



        private String color;
        private int size;
        private double weight;

        Myfirstcar(){
            
        }

        public static void start(){
            System.out.println("please start the car");
    }
    public static void accelarate(){
        System.out.println("press the accelarator ");
    }

    public void setcolor(String color){
      this.color=color;
    }
    public void setsize(int size){
        this.size=size;
    }
    public void setweight(double weight){
        this.weight=weight;
    }
    public void displaycar(){
        System.out.println("Color of the car is:"+ color );
        System.out.println("Size of the car is:"+ size );
        System.out.println("Weight of the car is:"+ weight );

    }
}
