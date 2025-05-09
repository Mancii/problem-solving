package arrays;

import java.util.Arrays;

public class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % n];
        }

        return ans;
    }
    public static void main(String[] args) {
        Concatenation c = new Concatenation();
        System.out.println(Arrays.toString(c.getConcatenation(new int[]{1,2,3,4})));
    }
}
/*

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

 */