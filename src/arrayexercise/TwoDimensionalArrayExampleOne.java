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
public class TwoDimensionalArrayExampleOne {

    public static void main(String[] args) {
        //declaration
        int[][] twoDimArray = new int[3][2];

        //initailization - row 1
        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        
        //initailization - row 2
        twoDimArray[1][0] = 3;
        twoDimArray[1][1] = 4;
        
        //initailization - row 3
        twoDimArray[2][0] = 5;
        twoDimArray[2][1] = 6;
       
        for (int row = 0; row < twoDimArray.length; row++) {            
            for (int col = 0; col < twoDimArray[row].length; col++) {
                System.out.printf("%4d",twoDimArray[row][col]);
            }
            System.out.println();
        }

    }

}
