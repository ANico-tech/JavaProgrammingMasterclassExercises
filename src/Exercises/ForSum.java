package Section4;

public class ForSum {
    public static void main(String[] args) {

//        int sum=0,count=0;
//        for(int i=0;i<=1000;i++){
//            if( (i%3==0) && (i%5 == 0) ){
//                count +=1;
//                sum = sum + i;
//                System.out.println(i);
//                if(count==5)
//                {
//                    System.out.println(sum);
//                    break;
//                }
//            }
//
//        }

//        System.out.println(sumOdd(1,100));
//        System.out.println(sumOdd(-1,100));
//        System.out.println(sumOdd(100,100));
//        System.out.println(sumOdd(13,13));
//        System.out.println(sumOdd(100,-100));
//        System.out.println(sumOdd(100,1000));

//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(11212));

//        System.out.println(sumFirstAndLastDigit(252));
//        System.out.println(sumFirstAndLastDigit(257));
//        System.out.println(sumFirstAndLastDigit(0));
//        System.out.println(sumFirstAndLastDigit(5));
//        System.out.println(sumFirstAndLastDigit(-10));

//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(getEvenDigitSum(-22));

//        System.out.println(hasSharedDigit(12,23));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(15,55));
//        System.out.println(hasSharedDigit(100,10));

//        System.out.println(hasSameLastDigit(42,22,71));
//        System.out.println(hasSameLastDigit(23,32,42));
//        System.out.println(hasSameLastDigit(9,99,999));

//        System.out.println(getGreatestCommonDivisor(25,15));
//        System.out.println(getGreatestCommonDivisor(12,30));
//        System.out.println(getGreatestCommonDivisor(9,18));
//        System.out.println(getGreatestCommonDivisor(81,153));
            printFactors(6);
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isOdd(int number){
        if(number<0) return false;

        if(number%2==1)
            return true;
        else
            return false;
    }

    public static int sumOdd(int start, int end){
        int sum=0;
        int z;
        if(start<0 || end<0) return -1;
        else if(start>end) return -1;
        else {
            for (z = start; z <= end; z++)
                if (isOdd(z))
                    sum += z;
            return sum;
        }

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int positiveNumber =0;
        if (number<0) positiveNumber=number*(-1);
        else positiveNumber=number;

        while(positiveNumber>0){

            reverse = reverse*10;
            reverse += positiveNumber %10;
            positiveNumber = positiveNumber/10;

        }
        if(number<0)
            reverse = reverse *(-1);
        if(number==reverse) return true;
        else
            return false;
    }

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = number % 10;

        if (number < 0) return -1;
        else {
            while (number > 0) {
                first = number % 10;
                number = number / 10;
            }
            return first + last;

        }
    }

    public static int getEvenDigitSum(int number){

        int digit = 0, sum=0;

        if(number<0) return -1;
        else{
                while (number>0){
                    digit=number%10;
                    if(digit%2==0) sum +=digit;
                    number = number/10;
                }
                return sum;
        }
    }

    public static boolean hasSharedDigit(int number1, int number2){
        if(number1<10 || number1 >99 || number2<10 || number2>99) return false;
        else {
            if( (number1%10)==(number2%10) || (number1%10)==((number2/10)%10) )
                return true;
            else  {
                if( ((number1/10)%10)==(number2%10) || ((number1/10)%10)==((number2/10)%10) )
                    return true;
                else
                    return false;}
        }
    }

    public static boolean hasSameLastDigit(int arg1, int arg2, int arg3){
        if( (!isValid(arg1)) || (!isValid(arg2)) || (!isValid(arg3)) ) return false;
        else {
            if( ((arg1%10) == (arg2%10)) || ((arg1%10) == (arg3%10)) || ((arg2%10)== (arg3%10)) ) return true;
            else return false;
        }
    }

    public static boolean isValid(int number){
        if(number<10 || number>1000)
            return false;
        else
            return true;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second<10) return -1;
        else {
            if (first % second == 0) return second;
            else if (second % first == 0) return first;
            else {
                for (int s = first / 2; s >= 1; s--) {
                    if ((first % s) == 0 && (second % s == 0)) {
                        return s;

                    }

                }
            }
            }
       return -1;
    }

    public static void printFactors(int number){
        if(number<1) System.out.println("Invalid Value");
        else {  for(int c=1;c<=number;c++) {
            if (number % c == 0)
                System.out.println(c);
        }
        }
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if(number<1) return false;
        else {
            for (int i=number/2;i>0;i--){
                if(number%i==0)
                    sum+=i;
            }
            if(number==sum) return true;
        }
       return false;
    }
}
