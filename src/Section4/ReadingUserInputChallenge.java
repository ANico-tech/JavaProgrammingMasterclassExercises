package Section4;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        int counter=0,numCount=1, sum=0;
        Scanner sc = new Scanner(System.in);
        while (numCount<=10){

            System.out.println("Enter number #" + numCount + ":");
          //  int number = sc.nextInt();

            boolean isNextInt = sc.hasNextInt();

            if (isNextInt){
                int number = sc.nextInt();
                sum+=number;
                counter++;
            }
            else
                System.out.println("Invalid numbered inserted");
            sc.nextLine();
            numCount++;
        }
        sc.close();
        System.out.println("Sum of numbers is: " + sum);
        System.out.println("Numbers inserted :" + counter);
    }
}
