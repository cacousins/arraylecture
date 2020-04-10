package arrayexercise;

public class CopyAnArray {
    public static void main(String[] args) {
        //original array
        int[] array = {20,30,40,50,60};      
        
        //create a new array from original array
        int[] copiedArray = new int[3];//0,1,2 //0,40,50
        
        System.arraycopy(array, 2, copiedArray, 1, 2);
        
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.println(copiedArray[i]);
        }
        
    }

}
