package Section4;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));

        System.out.println(hasEqualSum(0,-2,-2));
        System.out.println(hasEqualSum(0,-2,2));
    }

    public static boolean hasEqualSum(int arg1, int arg2, int arg3){
        return (((arg1+arg2)==arg3)?true:false);

    }
}
