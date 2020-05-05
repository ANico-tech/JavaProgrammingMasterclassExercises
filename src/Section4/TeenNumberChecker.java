package Section4;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen(int arg1, int arg2, int arg3){
        return ((arg1>=13 && arg1<=19)||(arg2>=13 && arg2<=19)|| (arg3>=13 && arg3<=19))?true:false;

    }
    public static boolean isTeen(int arg){
        return (arg>=13 && arg <=19)?true:false;

    }
}
