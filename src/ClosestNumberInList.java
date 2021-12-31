public class ClosestNumberInList {
    public static void main(String[] args) {
        int[] d = new int[]{-1,2,1,0,-4};
        int target = 4;

        int min = Math.abs(d[0]-target);
        int r = d[0];
        for (int j = 1; j< d.length; j++) {
            int res = Math.min(min, Math.abs(d[j]-target));
            if (res < min) {
                r = d[j];
                min = res;
            }
        }
        System.out.println(r);
    }
}
