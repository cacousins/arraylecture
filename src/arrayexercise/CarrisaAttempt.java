package arrayexercise;

public class CarrisaAttempt {

    public static void main(String[] args) {
        //indicate the index position of 66
        //declare and initialise a variable to store the requested value
        int arrayName[] = {12, 33, 55, 66, 77, 99, 101};
        int requestedValue = 78;
        boolean flag = false;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] == requestedValue) {
                flag = true;
                System.out.println("The index position of " + requestedValue
                        + " is " + i);
            }
        }

        if (flag == false) {

            System.out.println("The requested value " + requestedValue
                    + " cannot be found.");
        }
    }
}
