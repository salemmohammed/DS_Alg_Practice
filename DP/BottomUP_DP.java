class BottomUP_DP {
    public static void main(String[] args) {
        
        int[] val = {20,20,30};
        int[] w = {1,2,3};
        int W = 3;
        int n = val.length;
        
        int[][] K = new int[n+1][W+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i == 0 || j == 0 ){
                    K[i][j] = 0;
                }else if(j-w[i-1] >= 0){
                    K[i][j] = Math.max(K[i-1][j],K[i-1][j-w[i-1]]+val[i-1]);
                }else{
                    K[i][j] = K[i-1][j];
                }
                System.out.print("|"+K[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("Try programiz.pro");
    }
}