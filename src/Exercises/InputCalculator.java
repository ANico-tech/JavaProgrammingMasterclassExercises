package Section4;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum=0,count=0;

        while (true){

            //System.out.println("Enter number: ");
            boolean isNextInt = scanner.hasNextInt();

            if(isNextInt){

                int number = scanner.nextInt();
                sum += number;
                count +=1;
            }
            else {
                long avg = Math.round((double)sum / (double)count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
       scanner.nextLine();
        }

        scanner.close();

    }


//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        long roundAvg = 0;
//        while(true){
//            boolean isAnInt = scanner.hasNextInt();
//            if(isAnInt){
//                count++;
//                int number = scanner.nextInt();
//                sum += number;
//                roundAvg = Math.round((double) sum / (double) count);
//            } else {
//                break;
//            }
//        }
//        System.out.println("SUM = " + sum + " AVG = " + roundAvg);
//        scanner.close();
//    }
//}

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
