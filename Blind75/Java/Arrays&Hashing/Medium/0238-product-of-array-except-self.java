

class Solution {
   public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 1, right = 1;
        for(int i=0; i<nums.length; i++){
            answer[i] = left;
            left *= nums[i];
        }

        for(int i=nums.length-1; i>=0; i--){
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
    }
}

// https://leetcode.com/problems/product-of-array-except-self/

// ? Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// time is O(n)
// space is O(n) 

// notes
// compute the prefix of each index 1st go around
// compute the postfix of each index and multiply it by the prefix array 2nd go around
