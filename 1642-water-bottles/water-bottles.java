class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>= numExchange){
            int newB = numBottles / numExchange;
            int rem = numBottles % numExchange;
            ans = ans + newB;
            numBottles = newB + rem;
        }
        return ans;
    }
}