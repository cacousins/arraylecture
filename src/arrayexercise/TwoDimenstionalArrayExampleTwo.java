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
public class TwoDimenstionalArrayExampleTwo {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };
        
        /*for (int row = 0; row < array.length; row++) {
        for (int col = 0; col < array[row].length; col++) {
        System.out.print(array[row][col]+"  ");
        }
        System.out.println();
        }*/
        
        for(int[] myForEachArray: array){
            for(int theElementsWithinArray: myForEachArray ){
                System.out.print(theElementsWithinArray + " ");
            }
            System.out.println();
        }
    }

}
