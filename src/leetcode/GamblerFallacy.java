package leetcode;

import java.util.Arrays;

public class GamblerFallacy {

    int[] state = new int[6];
    GamblerFallacy() {
        Arrays.fill(this.state,1);
    }

    private int roll() {
        int sum = 0;
        for (int i =0; i< this.state.length; i++) {
            sum+=state[i];
        }

        int state = (int) (sum * Math.random());
        int target = 0;
        while(state>=0) {
            state-= this.state[target++];
        }

        for (int i = 0; i < this.state.length; i++) {
            if (i==target-1) {
                this.state[i] =1;
            } else {
                this.state[i] = this.state[i]+ 1;
            }
        }

        return target;

    }

    public static void main(String[] args) {
        GamblerFallacy g = new GamblerFallacy();
        System.out.println(g.roll());
        System.out.println(g.roll());
        System.out.println(g.roll());
        System.out.println(g.roll());
        System.out.println(g.roll());
        System.out.println(g.roll());
        System.out.println(g.roll());

    }
}
