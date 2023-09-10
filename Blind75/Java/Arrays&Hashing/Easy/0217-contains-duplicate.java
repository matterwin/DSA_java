import java.util.HashSet;

class Solution{
    public boolean containsDuplicate(int[] nums){
        if(nums.length<2) return false;

        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(s.contains(nums[i])) return true;
            s.add(nums[i]);
        }
        return false;
    }
}

// https://leetcode.com/problems/contains-duplicate/

// time is O(n) since we iterate through the whole array
// space is O(n) since we need to make a hashset of possibly n elements

// notes:
// we need a way to keep track of the duplicates, and what better way is there to do that than using a hashset