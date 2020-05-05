package Section4;

//        EXAMPLE INPUT/OUTPUT:
//
//        * canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
//
//        * canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//
//        * canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
//
//        * canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
//
//        * canPack (-3, 2, 12); should return false since bigCount is negative.

public class FlourPack {

    public static boolean canPack(int bigCount,int smallCount,int goal) {
        if (goal < 0 || bigCount < 0 || smallCount < 0 || (goal > (bigCount*5 + smallCount))) return false;

        if((bigCount*5 + smallCount) == goal) return true;

        if(bigCount==0){
            if(smallCount>=goal) return true;
        }
        else
            if(bigCount*5 == goal) return true;
            else if(bigCount*5 > goal) {if ((bigCount*5 - goal)%5==0) return true;
                                        else if(smallCount >= (goal%5)) return true;}
                  else
                      if(bigCount*5<goal) {if(smallCount >= (goal-bigCount*5)) return true;}


    return false;

    }

    public static void main(String[] args) {
//        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
//        System.out.println(canPack(0,5,4));
//        System.out.println(canPack(2,2,11));
//        System.out.println(canPack(5,3,24));
        System.out.println(18%5);
    }
}
