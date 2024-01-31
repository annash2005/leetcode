public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the map contains the complement, return the indices
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Otherwise, add the number and its index to the map
            numMap.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
