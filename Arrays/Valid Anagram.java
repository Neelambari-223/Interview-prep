/*Valid Anagram
Solved 
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.


Recommended Time & Space Complexity
You should aim for a solution with O(n + m) time and O(1) space, where n is the length of the string s and m is the length of the string t.


Hint 1
A brute force solution would be to sort the given strings and check for their equality. This would be an O(nlogn + mlogm) solution. Though this solution is acceptable, can you think of a better way without sorting the given strings?


Hint 2
By the definition of the anagram, we can rearrange the characters. Does the order of characters matter in both the strings? Then what matters?


Hint 3
We can just consider maintaining the frequency of each character. We can do this by having two separate hash tables for the two strings. Then, we can check whether the frequency of each character in string s is equal to that in string t and vice versa.*/

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
               int count= hm.get(s.charAt(i));
               count=count+1;
               hm.put(s.charAt(i),count);
            }
            else{
            hm.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(hm1.containsKey(t.charAt(i)))
            {
               int count= hm1.get(t.charAt(i));
               count=count+1;
               hm1.put(t.charAt(i),count);
            }
            else{
            hm1.put(t.charAt(i),1);
            }

            
        }
        return hm.equals(hm1);
    }
}


