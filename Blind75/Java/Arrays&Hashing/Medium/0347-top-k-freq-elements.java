import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) m.put(num, m.getOrDefault(num, 0) + 1);

        // array of buckets, i.e., index has an array of the num of same freqs
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int num : m.keySet()) {
            int frequency = m.get(num);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }

        // Traverse the buckets from right to left (higher frequency to lower)
        // to find the top k frequent elements.
        int[] result = new int[k];
        int resultIndex = 0;
        for (int i = buckets.length - 1; i >= 0 && resultIndex < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[resultIndex++] = num;
                    if (resultIndex == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}

// https://leetcode.com/problems/top-k-frequent-elements/description/

// ? Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

// time is O(n) 
// freq map takes O(n) to traverse the nums array
// creating buckets takes O(n) to iterate through the map
// traversing the buckets worst case takes n time, so it's O(n)

// space is O(n + k) 
// O(n) for the map
// O(n) for the bucket array
// O(k) for the result array
// so O(n) + O(n) + O(k) = O(n + k)
// n is the num of elements in 'nums' and k is the top freq elements

// notes
// this uses bucket sort
// get freq of elements
// 2nd part create an array of lists, where the array index refers to the freq
// and at each freq from the map, add that element to the specified array index of freqs
// last part is traverse that array backwards, and in each index, traverse the list until we've reached k most freq elems