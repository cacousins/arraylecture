package arrayexercise;

public class RandomArrayGenerator {

    public static void main(String[] args) {

        //creating a scanner object named input
        java.util.Scanner input = new java.util.Scanner(System.in);

        //reqest the size of the array from the end-user
        System.out.print("Enter the size of the array >> ");
        int arrayLength = input.nextInt();
        double[] anArray = new double[arrayLength];
        
        //((highValue - lowValue +1) + lowValue)        
        //generates between 20 and 40
        int highValue = 50;
        int lowValue = 10;
        
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = (Math.random() * 
                    (highValue - lowValue + 1) + lowValue);
            System.out.printf("My Array Elements : %.2f%n" , anArray[i]);
        }

    }

}
