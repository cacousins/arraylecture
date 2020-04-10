/*
      File Name:    LargestNumberArray.java
         Author:    Colin A. Cousins
           Date:    April 7, 2020
    Description:    Find The Largest Number From An Array
 */
package arrayexercise;

public class LargestNumberArray {

    public static void main(String[] args) {

        //declare an initialize an array
        int arrayName[] = {12, 33, 55, 66, 77, 99, 101};
        
        //locate 66

        //declare and initialize a variable to store the highest element
        int maxNumber = arrayName[0];

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] > maxNumber) {
                maxNumber = arrayName[i];
            }
        }

        System.out.println("The maximum array element is : " + maxNumber);

    }

}
