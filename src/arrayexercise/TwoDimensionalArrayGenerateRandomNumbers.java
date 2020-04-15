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
public class TwoDimensionalArrayGenerateRandomNumbers {
    public static void main(String[] args) {
        //declaration
        int[][] array = new int[4][4];
        //random values - high and low values
        int highValue=50;
        int lowValue=10;
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = (int)(Math.random() * 
                        (highValue - lowValue + 1) + lowValue);
                
                //print the array values
                System.out.print(array[row][col] + "  ");
            }
            System.out.println();
        }
        
    }

}
