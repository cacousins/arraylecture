/*
      File Name:    TwelveInts.java
         Author:    Colin Cousins
           Date:    April 9, 2020
    Description:    Write an app that takes 12 int and output in reverse
*/
package arrayexercise;

/**
 *
 * @author cacousins
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] twelveIntegers = {10, 10, 30, 40, 50, 60, 70, 
            80, 90, 91, 92,93}; //size = 12, index 0 to 11
        
        for (int i = 0; i < twelveIntegers.length; i++) {            
            System.out.print(twelveIntegers[i] + " ");
        }
        System.out.println();
        for (int i = twelveIntegers.length -1 ; i >=0; i--) {
            System.out.print(twelveIntegers[i] + " ");
        }
        System.out.println();
    }
    
}
