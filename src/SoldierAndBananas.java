import java.util.Scanner;

public class SoldierAndBananas {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int bc = Integer.parseInt(s.next());
        int amount = Integer.parseInt(s.next());
        int num= Integer.parseInt(s.next());
        int count = 0;
        for (int i = 1; i <= num; i++) {
           count = count+ bc*i;
        }
        if(count>amount){
            System.out.println(count-amount);
        }else{
            System.out.println(0);
        }
    }

}