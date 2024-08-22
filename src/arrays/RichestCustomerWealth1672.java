package arrays;

public class RichestCustomerWealth1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWhealth = 0;
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum > maxWhealth){
                maxWhealth = sum;
            }
        }
        return maxWhealth;
    }
}
