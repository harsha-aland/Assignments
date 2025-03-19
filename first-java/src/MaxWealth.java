public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {2,3,4}, {4,5,6}};
        System.out.println(maximumWealth(accounts));
    }

    //https://leetcode.com/problems/richest-customer-wealth/description/
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int[] wealth = new int[m];

        int max = 0;
        for(int i = 0; i<m;i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            wealth[i]= sum;
        }
        max =  wealth[0];
        for(int i= 1;i<wealth.length;i++){
            if(wealth[i]>max){
                max = wealth[i];
            }
        }
        return max;
    }
}
