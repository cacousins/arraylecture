/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexercise;

/**
 *
 * @author cacousins
 */
public class NewClass1 {

    public static void main(String[] args) {
        int[][] anArray = new int[4][4];

        //((highValue - lowValue +1) + lowValue)
        //generate values between 10 and 50
        //declare and initialise high value and low value
        int highValue = 50;
        int lowValue = 10;

        for (int row = 0; row < anArray.length; row++) {
            for (int col = 0; col < anArray[row].length; col++) {
                anArray[row][col] = (int) (Math.random() * 
                        ((highValue - lowValue + 1) + lowValue));
                System.out.printf("%4d", anArray[row][col]);
            }
            System.out.println();
        }
    }

}
