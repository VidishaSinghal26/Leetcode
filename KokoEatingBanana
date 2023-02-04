<-- Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30 -->


Solution :

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int end = Integer.MIN_VALUE;
        int start = 1;
        for(int i = 0 ; i < piles.length ; i++){
            if(piles[i]>end){
                end = piles[i];
            }
        }
        while(start < end){
            int mid = start + (end-start)/2;
            if(check(piles,mid,h))
                end = mid;
            else
                start = mid +1;
        }
        return end;
    }

    public boolean check(int[] piles, int mid , int h){
        int time = 0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%mid != 0){
                time += ((piles[i]/mid) + 1);
            }
            else{
                time += piles[i] / mid;
                }
            }
        if(time <= h)
            return true;
        else
            return false;   
    }
}
