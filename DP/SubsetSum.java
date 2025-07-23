import java.util.*;

class SubsetSum {
	public static void Subset_bottomUp(int total, int[] items){

		System.out.println(" total: "+ total);
		System.out.print(" items: ");
		for (int i=0; i< items.length; i++ ) {
			System.out.print(items[i]);
			if (i < items.length - 1){
				System.out.print(",");
			}
		}
		System.out.println();

		boolean[][] dp = new boolean[items.length+1][total+1];
		
		for (int i=0;i<=items.length ; i++) {
			dp[i][0] = true;
		}
		for (int i=1;i<=items.length ; i++) {
			for(int j=1;j <= total ; j++){
				if(j < items[i-1]){
					dp[i][j] = dp[i-1][j];
				}else{
					dp[i][j] = dp[i-1][j] || dp[i -1 ][j- items[i-1]] ;
				}

				
			}
		}

		for (int i=0;i<=items.length ; i++) {
			for(int j=0;j <= total ; j++){
				System.out.print((dp[i][j] ? "T" : "F") + " ");
			}
			System.out.println();
		}
		System.out.println("\nSubset exists? " + dp[items.length][total]);

		List<Integer> subset = new ArrayList<>();
		int i =items.length, j=total;
		while(i>0 & j>0){
			if(dp[i][j] != dp[i-1][j]){
				subset.add(items[i-1]);
				j = j - items[i-1];
			}
			i--;
		}
		Collections.reverse(subset);
		System.out.println("Subset: " + subset);

	}
	public static void main(String args[]) {
		System.out.println(" Subset Sum Problem ");
		int[]items = {2,3,7,8,10};
		Subset_bottomUp(11,items);
	}
}