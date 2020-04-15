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
public class TwoDimensionalArrayUserInput {
    public static void main(String[] args) {
        int rowNumber, colNumber;
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        //enter the size of the row
        System.out.print("Enter rows >> ");
        rowNumber = input.nextInt();
        
        //enter the size of the col
        System.out.print("Enter cols >> ");
        colNumber = input.nextInt();
        
        //create array
        int[][] array = new int[rowNumber][colNumber];
        
        //allow for user input
        for (int row = 0; row < rowNumber; row++) {
            for (int col = 0; col < colNumber; col++) {
                System.out.print("Enter Values: " + row + " " + col + " >> ");
                array[row][col] = input.nextInt();
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
        
        
    }

}
