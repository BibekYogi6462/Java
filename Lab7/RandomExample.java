/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Bibek Yogi
 */
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random integers between 1 and 100:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println(randomNumber);
        }
    }
}
