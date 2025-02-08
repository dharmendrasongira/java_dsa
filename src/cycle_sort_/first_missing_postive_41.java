package cycle_sort_;

import java.util.ArrayList;

class first_missing_postive_41 {

    // Helper method jo do elements ko swap karta hai
    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Method jo first missing positive integer ko find karta hai
    public int firstMissingPositive(int[] nums) {
        int n = nums.length; // Array ki length le lo
        int i = 0; // Index initialize karte hain

        // Array ko rearrange karne ke liye loop
        while (i < n) {
            // Check karo kya current number sahi position par hai
            // ya phir out of range hai (<=0 ya >n) ya already swapped hai
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] > n || nums[i] == nums[nums[i] - 1]) {
                i++; // Next index par chalo
            } else {
                // Number ko uski sahi position par swap karo
                swap(i, nums[i] - 1, nums);
            }
        }

        // First missing positive number check karo
        for (int j = 0; j < n; j++) {
            // Agar index j par number j + 1 ke barabar nahi hai, toh wo missing hai
            if (nums[j] != j + 1) {
                return j + 1; // First missing positive return karo
            }
        }

        return n + 1; // Agar saare numbers present hain, toh n + 1 return karo
    }

    public static void main(String[] args) {
        first_missing_postive_41 solution = new first_missing_postive_41();

        // Example array jisme missing positive numbers hain
        int[] nums = {3, 4, -1, 1};

        // First missing positive number find karo
        int result = solution.firstMissingPositive(nums);

        // Result print karo
        System.out.println("First missing positive: " + result);
    }
}
