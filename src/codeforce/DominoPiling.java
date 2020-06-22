import java.util.Scanner;

public class DominoPiling {

    static Scanner sr = new Scanner(System.in);
    public static void main(String args[])
    {
        //takes in the dimensions of the square and tiles
        double n = sr.nextInt();
        double m = sr.nextInt();
        System.out.println((int)(m*n)/2);
    }
}
