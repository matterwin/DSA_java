import java.util.HashMap; // for sol 2

class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for(int i=0; i<t.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int f : freq) if(f != 0) return false;

        return true;
    }
}

//https://leetcode.com/problems/valid-anagram/

// a valid anagram of a string, is where their frequencies of characters match and are equal

// time is O(n) to iterate through the whole string simultaneously for s and t
// space is O(n) to store n chars and its freq

// notes
// idea is to store the freq of each char in both t and s, but only increment the char freq for s chars and decrement the char freq for t chars
// so once we iterate through the array, we can iterate through the freq array and make sure that the freq's cancel out and result to a 0
// if freq < 0 or > 0 then we know that the 2 strings aren't anagrams of each other



// another way of doing this is using a hashmap

class Solution2{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> m = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 1);
            m.put(t.charAt(i), m.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(char c: m.keySet()) if(m.get(c) != 0) return false;

        return true;
    }
}

// time is O(n)
// space is O(n)

// but this is much slower 19 ms than array-based solution above

// its slower and not worth using since we have a known size for our set, so using an array is mush faster and efficient