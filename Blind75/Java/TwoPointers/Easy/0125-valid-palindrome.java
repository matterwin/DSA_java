

class Solution {
    public boolean isPalindrome(String s) { 
        int l = 0, r = s.length()-1;
        while(l < r){
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;   
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;

            l++;
            r--;
        }

        return true;
    }
}

// https://leetcode.com/problems/valid-palindrome/

// ? Given a string s, return true if it is a palindrome, or false otherwise. A palidrome is like "racecar"
// ? Only consider alphanumeric chars and ignore cases

// time is O(n)
// space is O(1) 

// notes
// 2 pointers, l is at start, r is at end and iterate until they meet
// we only want alphanumeric chars so iterate l++ whenever l is not an alphanumeric char
// do the same but for r
// once both l and r is an alphanumeric char we test if they equal to each other
// if they don't return false
// increment l and decrement r for next iteration
// return true if return false never happens