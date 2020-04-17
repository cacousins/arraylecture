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
public class TwoDimensionalArraySum {
    public static void main(String[] args) {
        
        int [][] array = {{1,2,3,4}, {1,2,3,4}};
        int sum = 0;
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("%3d" , array[row][col]);
            }
            System.out.println();
        }
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum+= array[row][col];
                //sum = sum + array[row][col];
            }
        }
        
        System.out.println("The total is: " + sum);
    }

}
