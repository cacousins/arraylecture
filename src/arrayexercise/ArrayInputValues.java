package arrayexercise;

public class ArrayInputValues {
    public static void main(String[] args) {
        //creating a scanner object named input
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        //reqest the size of the array from the end-user
        System.out.print("Enter the size of the array >> ");
        int arrayLength = input.nextInt();        
        double[] anArray = new double[arrayLength];
        
        for (int i = 0; i < anArray.length; i++) {
            System.out.print("Enter A Value >> ");
            anArray[i] = input.nextDouble();
        }
        
        /*for (int i = 0; i < anArray.length; i+=2) {
        System.out.format("Entered values were : "
        + String.format("%.2f%n", anArray[i]));
        }*/
        
        for (int i = 0; i < anArray.length; i+=2) {
            System.out.printf("Entered values were : %.2f%n", anArray[i]);
        }
        
    }
    
}
