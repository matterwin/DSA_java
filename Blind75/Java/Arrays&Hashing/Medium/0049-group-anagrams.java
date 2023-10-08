import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class Solution{
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();

        for(String s : strs){ // O(m)
            char[] c = s.toCharArray(); // O(n)
            Arrays.sort(c); // O(logn) so O(nlogn)
            String sorted = String.valueOf(c); //valueOf converts the char array into a string rep
            
            if(!m.containsKey(sorted)) m.put(sorted, new ArrayList<>()); 
            // means there is no anagram of this sorted string so add it to map; it's new

            m.get(sorted).add(s); // add it to the list and if the sorted str is already in the list it just adds it to the nonempty list
            // if the sorted str was not previously in the list, then just add itself to the empty anagram list
        }

        return new ArrayList<>(m.values()); // return all the values of m, which is the lists of anagrams
    }
}

// https://leetcode.com/problems/group-anagrams/description/

// time is O(m * n * logn)
// space is O(m * n) 
// where m is the total element count in strs and n is the char count in each string in strs

// notes
// keep track of the list of anagrams by sorting each string in strs, and each str as the key in the map
// if the curr sorted str is not in the map via containsKey(), then its a new possible anagram and we must create a new, empty ArrayList for that anagram
// and we add the sorted value into the list 
// then we add for every case the curr string s via key sorted string
// return the values of the map, which is the list of list of strings that are anagrams
