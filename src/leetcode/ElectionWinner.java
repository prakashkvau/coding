package leetcode;

/**
 * ElectionWinner
 */
public class ElectionWinner {
    static int electionsWinners(int[] votes, int k) {
        int max = 0;
        int totalMaxes = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] >= max) {
                max = votes[i];
                totalMaxes++;
            }
        }
        
        int count = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] + k > max) count++; 
        }
        if (count ==0) {
            if (totalMaxes == 1)
            return 1;
            return 0;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] votes = new int[]{5,1,3,4,1};
       System.out.println(electionsWinners(votes, 0)); 
    }
}