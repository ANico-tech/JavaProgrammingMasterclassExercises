package Section4;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1,-2020));

    }

    public static boolean isLeapYear(int year){
        if(year<1 || year>9999 )
            return false;
        else
            if( (year%4 == 0) && (year%100 != 0) )
                return true;
            else if(year%400 == 0)
                return true;
            else return false;
    }

    public static int getDaysInMonth(int month, int year){
        if(year<1 || year>9999)
            return -1;
        else{
            switch (month){
                case 1:
                    return 31;
                case 2:
                    if(isLeapYear(year)) return 29;
                    else return 28;
                   // break;
                case 3:
                    return 31;
                   // break;
                case 4:
                    return 30;
                   // break;
                case 5:
                    return 31;
                  //  break;
                case 6:
                    return 30;
                  //  break;
                case 7:
                    return 31;
                   // break;
                case 8:
                    return 31;
                 //   break;
                case 9:
                    return 30;
                   // break;
                case 10:
                    return 31;
                  //  break;
                case 11:
                    return 30;
                  //  break;
                case 12:
                    return 31;
                  //  break;

                default:
                    return -1;
                    //break;
            }
    }
    }

}
