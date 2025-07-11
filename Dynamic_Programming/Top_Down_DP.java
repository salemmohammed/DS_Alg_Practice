import java.util.*;

class Top_Down_DP {

    public static int TopDown_DP(int W, int[] val, int n, int[] w, int[][] memo) {
       
        if(W == 0 || n == 0){
            return 0;
        }
        
        if(memo[n][W] != -1){
            return memo[n][W];
        }
        
        int pick=0, not_pick=0;
        
        if(w[n-1] <= W){
            pick = val[n-1] + TopDown_DP(W - w[n-1], val, n-1, w, memo);
        }
        
        not_pick = TopDown_DP(W, val, n-1, w, memo);
        return memo[n][W] = Math.max(pick,not_pick);
    
    }
    public static void main(String[] args) {
        int[] val = {20,20,30};
        int[] w = {1,2,3};
        int W = 3;
        int n = val.length;
        int[][] memo = new int[n+1][W+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                memo[i][j] = -1;
                System.out.print("|"+memo[i][j]);
            }
            System.out.println("|");
        }
        
        TopDown_DP(W,val,n,w,memo);
        
        System.out.println("After Calculation of DP");
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                System.out.print("|"+memo[i][j]);
            }
            System.out.println("|");
        }
    }
}