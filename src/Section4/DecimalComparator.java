package Section4;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double arg1,double arg2){
        if((int)(arg1*1000) == (int)(arg2*1000))
            return true;
        else
            return false;
    }

}
