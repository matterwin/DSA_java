import java.util.Set;
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums) set.add(num); // O(n)
        
        int max = 1;
        for(int num : nums) {
            if(set.remove(num)) {//num hasn't been visited
                int val = num;
                int sum = 1;
                while(set.remove(val-1)) val--;
                sum += num - val;
                
                val = num;
                while(set.remove(val+1)) val++;
                sum += val - num;
                
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
// https://leetcode.com/problems/longest-consecutive-sequence/description/

// ? Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// time is O(n) from the iterating over the array nums
// space is O(n) from the set

// notes
// have a set of non duplicated values since we dont care about duplicates for finding a consecutive seq
// for each num in nums array, remove that num from the set, and loop to see any numbers consecutively/numerically less than the num we removed from set
// and do the same for the numbers greater than what we pulled out.
// summate those loops by 1st subtracting the num we pulled out and our potentially decreased val of such a num, which is subtracted by the len of a seq
//  we found, and add that to sum including sum.
// do the same for the increasing loop, but subtract the potential length of the seq - the num we pulled out, adding sum into as well
// keep track of the max and return max