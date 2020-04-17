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
public class TwoDimensionalArrayColumn {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int sum = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("%3d", array[row][col]);
            }
            System.out.println();
        }

        for (int row = 0; row < array[0].length; row++) {
            for (int col = 0; col < array.length; col++) {
                sum += array[col][row];
            }
            System.out.println("Column Total is  " + sum);
            sum = 0;
        }

    }

}
