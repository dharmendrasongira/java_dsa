package cycle_sort_;

class Solution {

    void swap(int i, int j ,int []nums) {
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == i ||nums[i] == n) i++;
            else{
                swap(i, nums[i], nums);
            }

        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j)
                return j;} return nums.length;}
}
public class missing_number {



    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example input array
        int[] nums = {3, 0, 1}; // The missing number is 2

        // Call the missingNumber method and print the result
        int missingNum = solution.missingNumber(nums);
        System.out.println("The missing number is: " + missingNum);
    }
}
