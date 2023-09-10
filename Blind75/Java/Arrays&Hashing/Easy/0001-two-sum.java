import java.util.HashMap;

class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            m.put(nums[i], i);
            if(m.containsKey(target - nums[i])){
                int later = i;
                int before = m.get(target - nums[i]);
                return new int[]{before, later};
            }
        }

        return new int[2];
    }
}

// https://leetcode.com/problems/two-sum/submissions/

// time is O(n) iterate through the whole array worst case
// space is O(n) store all elements worst case

// notes
// we need to get track of the index and the value of nums and we do that via a map as key is the value and the value is the index of the map
// so, we iterate through the array and see if there exists a number already we target - curr value = value already stored in the map
// and if we get a hit then we know there are 2 elements that sum up to target, and we return the index in an array via simple logic

// there is different ways of returning the index array, but here is a simple case above