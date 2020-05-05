package Section4;

public class DiagonalStar {
    public static void printSquareStar(int number){
        if(number<5) System.out.println("Invalid Value");
        else {

            for (int row=1;row<=number;row++){
                for (int columm=1;columm<=number;columm++){
                    if(row==1||row==number||columm==1||columm==number )
                        System.out.print("*");
                    else
                    if(row==columm)
                        System.out.print("*");
                    else
                    if(columm==(number-row+1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(6);
    }
}
