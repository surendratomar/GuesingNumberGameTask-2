package articlecodesinjava;

import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {

        int x;
        Random generator = new Random();
        System.out.println("5 random numbers from 0 to 10");
        for(int i = 0; i < 5; i++){
            x = generator.nextInt(5);
            System.out.print(x+" , ");
        }
    }
}
