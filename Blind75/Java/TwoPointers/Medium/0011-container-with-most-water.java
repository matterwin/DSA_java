
class Solution {
    public int maxArea(int[] height) {
        //width is the distance from the right to the left endpoint (or rightIndex - leftIndex)
        int left = 0, right = height.length - 1, minHeight, maxArea = 0;

        while (left < right) {
            minHeight = Math.min(height[left], height[right]);

            // Update maxArea if the current area is greater
            maxArea = Math.max(maxArea, (right - left) * minHeight);

            // Move the pointers based on the comparison of heights
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}

// https://leetcode.com/problems/container-with-most-water/

// ? You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.

// time is O(n) iterate over height array
// space is O(1)

// notes
// need area of container so l x w, but in this lowest height * right - left heights (for width)
// while l < r, get min height btw l & r
// keep track of max area via calc area and compare to old max
// always iterate the smallest height, so we can find bigger areas