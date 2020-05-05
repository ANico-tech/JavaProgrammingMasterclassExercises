package Section4;

public class LargestPrimeNumber {

    public static int getLargestPrime(int number){
        if(number<=0 || number==1) return -1;
        else {
            int i=number/2;
            boolean flag=true;
            while (i>1){
                if ((number%i)!=0) i=i-1;
                else {flag=false;
                        int j=i/2;

                        boolean flag2=false;
                        while (j>1){
                            if(i%j!=0) j=j-1;
                            else{
                                flag2=true;
                                break;
                            }
                        }
                        if(flag2) i=i-1;
                        else return i;
                        }
            }
            if(flag) return number;

        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(getLargestPrime(21));
//        System.out.println(getLargestPrime(217));
//        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(7));
//        System.out.println(getLargestPrime(-1));
    }
}
