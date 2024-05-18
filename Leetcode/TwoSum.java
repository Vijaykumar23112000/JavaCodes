package Leetcode;

/*
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        
        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        
        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]
 */

public class TwoSum{
    
    public static int [] twoSum(int  [] nums , int target){
        int arr [] = new int [2];
        for(int cur =0;cur<nums.length;cur++){
            int x = target-nums[cur];
            arr[0] = cur;
            for(int j = cur+1;j<nums.length;j++){
                if(x==nums[j]){
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}