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
public class NewClass {

    public static void main(String[] args) {
        int[] array = {20, 30, 40, 50, 60};
        int[] copiedArray = new int[3];
        System.arraycopy(array, 2, copiedArray, 1, 2);
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.println(copiedArray[i]);
        }

    }

}
