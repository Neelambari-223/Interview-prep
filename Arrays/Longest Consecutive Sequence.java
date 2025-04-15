/*Longest Consecutive Sequence
Solved 
Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [2,20,4,10,3,4,5]

Output: 4
Explanation: The longest consecutive sequence is [2, 3, 4, 5].

Example 2:

Input: nums = [0,3,2,5,4,6,1,1]

Output: 7
Constraints:

0 <= nums.length <= 1000
-10^9 <= nums[i] <= 10^9*/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        int count=1,max_count=0;
        int i=0;
        int element=nums[0];
        while(i<nums.length)
        {
            if(hs.contains(element+1))
            {
                count++;
                element+=1;
                continue;
            }
            else{
                max_count=Math.max(count,max_count);
                i++;
                if(i<nums.length){
                    element=nums[i];
                }
                
                count=1;
            }

        }
        return max_count;
    }
}

