package Section4;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter Number: ");
            boolean isNextInt = scanner.hasNextInt();

            if(isNextInt){
                int number = scanner.nextInt();
                if(max<number) max = number;
                if(min>number) min = number;
            }else {
                System.out.println("Minimum number is: " + min);
                System.out.println("Maximum number is: " + max);
                break;
            }
            scanner.nextLine();
        }
scanner.close();
    }
}
