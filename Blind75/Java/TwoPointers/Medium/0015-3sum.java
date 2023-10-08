import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the input array in ascending order
        
        LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>(); // Create a linked list to store the solutions
        
        for (int i = 0; i < nums.length - 2; i++) { // Loop through the array, stopping two elements before the end
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // Check if current element is unique (or the first element)
                int target = 0 - nums[i]; // makes target negative since we want to find left + right = target to get 0
                int left = i + 1; // Initialize the left pointer to the next element after i
                int right = nums.length - 1; // Initialize the right pointer to the last element

                while (left < right) { // Loop until the left and right pointers meet
                    if (nums[left] + nums[right] == target) { // Found a valid triplet
                        ArrayList<Integer> miniSol = new ArrayList<>(); // Create a list to store the triplet
                        miniSol.add(nums[i]); // Add the current element to the triplet
                        miniSol.add(nums[left]); // Add the left element to the triplet
                        miniSol.add(nums[right]); // Add the right element to the triplet
                        sol.add(miniSol); // Add the triplet to the solutions list
                        
                        // Move the left pointer to the next unique element
                        while (left < right && nums[left] == nums[left + 1]) left++;

                        // Move the right pointer to the next unique element
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target) { // Sum is too large, move the right pointer leftwards
                        right--;
                    } else { // Sum is too small, move the left pointer rightwards
                        left++;
                    }
                }
            }
        }
        
        return sol; // Return the list of valid triplets
    }
}


// https://leetcode.com/problems/3sum/submissions/

// ? Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// ? Notice that the solution set must not contain duplicate triplets.

// time is O()
// space is O() 

// notes
// look at comments