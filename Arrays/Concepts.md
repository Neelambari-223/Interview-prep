**Traverse+Min/Max:**

Traverse through loops(for,while,do while)
MIN/MAX-assign min and max as the first element and travere to find an other element is max or min than the current one

**Two Pointers**

**Pattern:**Two pointer
Have a left and right two pointers

**Strategies:**

**1.Converging Pointers**
       Pointers start from opposite ends and move towards each other
       used to compare two elements of array/String
       Example:palindrom

**2.Parallel Pointers**
        Both pointer start at the same end & move in same direction
        Left pointer-to track progress & maintain constraint
        Right pointer-to explore and find new info
        Example:sliding window(sub arrays)

**3.Trigger based pointers**
         traverse the first pointer till it meets certain condition
         traverse the second pointer to explore the info 

**Where to apply two pointer concept**
    Linear data structure(Arrays,Strings,Linked list)
    and results which can generated from two values/inputs


**Sliding Window**

Use two pointers to implement sliding window

**Types of sliding window**

1.Fixed sliding window(exact window size)
2.Dynamic sliding window(shirnk/expand window size according to the conditions)


**Prefix Sum**

Cumulative sum of elements from the start of teh array to the given index 
example:range sum queries,subarray sum 

**Kadane's algorithm**

 Traverse the array while maintaining:

max_current — the maximum sum ending at the current position

max_global — the maximum sum found so far

At each index:

max_current = max(nums[i], max_current + nums[i])

max_global = max(max_global, max_current)


**Hash map**

  A data structure that stores key value pairs
  Keys are unique,values can be duplicated 
  does not maintain any order
  HashMap<Key,Value>

HashMap<String,Double> map=new HashMap<>();
map.put("apple",0.50);
map.remove("apple")
map.get("apple")
map.containsKey("apple")
map.containsValue(0.50)
map.size()
for(String key:map.keyset())
{
s.o.p(key+":$ "+map.get(key))
}

**Binary Search**

search algorithm that finds the position of a target value within a sorted array.
Half of the array is eliminated during each step

**Time complexity** is O(log n).

Set low = 0, high = n - 1

While low <= high:

Find mid: mid = low + (high - low) / 2

If arr[mid] == target: return mid

If arr[mid] < target: search right half (low = mid + 1)

If arr[mid] > target: search left half (high = mid - 1)
