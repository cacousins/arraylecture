/*
      File Name:    SearchForIndexPosition.java
         Author:    Colin A. Cousins
           Date:    April 7, 2020
    Description:    Find The Position Of An Index Element
 */
package arrayexercise;

public class SearchForIndexPosition {

    public static void main(String[] args) {

        //declare an initialize an array
        int arrayName[] = {12, 33, 55, 66, 77, 99, 101};

        int arraySearchValue = 66;
        boolean flag = false;

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] == arraySearchValue) {
                flag = true;
                System.out.println("Value found at index position >> " + i);
            }
        }
        if (flag == false) {
            System.out.println("The value was not found in the array ");
        }

        

    }

}
