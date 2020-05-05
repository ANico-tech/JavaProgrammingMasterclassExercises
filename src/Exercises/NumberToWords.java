package Section4;

public class NumberToWords {


    public static int getDigitCount(int number){
        int counter=0;
        if (number<0)
            return -1;
        else
            if (number==0) return 1;
            else
            {
                while(number>0){
                    number=number/10;
                    counter++;
                }
                return counter;
            }
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        // int digits = getDigitCount(number);
        if (number < 0) {
            number = number * (-1);
            int digits = getDigitCount(number);
            while (digits > 0) {
                reverseNumber += number % 10;
                number = number / 10;
                reverseNumber = reverseNumber * 10;
                digits--;
            }
            return (reverseNumber * (-1))/10;
        } else {
            int digits = getDigitCount(number);
            while (digits > 0) {
                reverseNumber += number % 10;
                number = number / 10;
                reverseNumber = reverseNumber * 10;
                digits--;
            }
            return (reverseNumber/10);
        }
    }

        public static void numberToWords(int number) {
            if (number < 0)
                System.out.println("Invalid Value");
            else
            if (number == 0)
                System.out.println("Zero");
            else {
               int newNumber = reverse(number);
                while (newNumber > 0) {
                    switch (newNumber % 10) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                        default:
                            System.out.println("OTHER");
                            break;

                    }
                    newNumber = newNumber / 10;
                }
            if(getDigitCount(number)!=getDigitCount( reverse(number))){
                    int diff = getDigitCount(number)-getDigitCount(reverse(number));
                    while (diff>0){
                        System.out.println("Zero");
                        diff --;
                    }
                }

            }
        }


        public static void main(String[] args) {
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));
//                numberToWords(123);
//            System.out.println();
//                numberToWords(1010);
//            System.out.println();
//                numberToWords(1000);
//            System.out.println();
//                numberToWords(-12);
//            System.out.println();
            numberToWords(0);
    }
}
