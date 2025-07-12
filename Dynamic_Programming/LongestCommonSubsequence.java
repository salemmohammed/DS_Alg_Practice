import java.util.*;

class LongestCommonSubsequence {

    public static int BottomUP_LCS(char[] str1, char[] str2){
        int max = 0;
        int[][] memo = new int[str1.length+1][str2.length+1];
        
        for (int i =1; i < memo.length ; i++ ) {
            for (int j=1; j < memo[i].length ; j++ ) {
                if(str1[i-1] == str2[j-1]){
                    memo[i][j] = memo[i-1][j-1] + 1;
                } else{
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
                if(memo[i][j] > max){
                    max = memo[i][j];
                }
            }
        }
        
        return max;
    }

    public static int TopDown_LCS(char[] str1, char[] str2, int length1, int length2){
        if(length1 == str1.length || length2 == str2.length) {
            return 0;
        }
        if(str1[length1] == str2[length2]){
            return 1 + TopDown_LCS(str1,str2,length1+1,length2+1);
        }else{
            return Math.max(TopDown_LCS(str1,str2,length1+1,length2),TopDown_LCS(str1,str2,length1,length2+1));
        }
    }
    
    public static void main(String[] args) {
        String a = "abcdaf";
        String b = "acbcf";
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        int len1 =0, len2 = 0;
        System.out.println("The longest common subsequense DP bottom up is: "+ BottomUP_LCS(str1,str2));
        System.out.println("The longest common subsequense DP topdown is: "+ TopDown_LCS(str1,str2, len1,len2));
        System.out.println("The End");
    }
}