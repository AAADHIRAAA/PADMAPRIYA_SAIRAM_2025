/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/
class Solution {
    public boolean isAnagram(String s, String t) {
       char s1[]=s.toCharArray();
       Arrays.sort(s1);
       char s2[]=t.toCharArray();
       Arrays.sort(s2);
       String sortedS1 = new String(s1);
       String sortedS2 = new String(s2);
 
       return sortedS1.equals(sortedS2);
    }
}
