/*Products of Array Except Self
Solved 
Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

Each product is guaranteed to fit in a 32-bit integer.

Follow-up: Could you solve it in 
O
(
n
)
O(n) time without using the division operation?

Example 1:

Input: nums = [1,2,4,6]

Output: [48,24,12,8]
Example 2:

Input: nums = [-1,0,1,2,3]

Output: [0,-6,0,0,0]
Constraints:

2 <= nums.length <= 1000
-20 <= nums[i] <= 20
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i=0;
        int n=nums.length;
        int result[]=new int[n];
        int mul=1;
        for(int j=0;j<n&&i<n;j++)
        {
            System.out.println("i="+i+" j="+j);
            if(i==j)
            {
                System.out.println("1");
                if(j==n-1)
                {
                    result[i]=mul;
                }
                continue;
                //System.out.println("2");
            }
            
             mul=mul*nums[j];          
             System.out.println("Mul="+mul);
             System.out.println(" j="+j);
             if(j==n-1)
             {
                System.out.println("i="+i+" j="+j+" mul="+mul);
                result[i]=mul;
                mul=1;
                System.out.println("result[i]="+result[i]);
                i++;
                if(i!=n)
                {
                    j=-1;
                }
             }
             
        }
        return result;
    }
}  

/*Better approach with prefix & suffix*/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }
        return res;
    }
}
