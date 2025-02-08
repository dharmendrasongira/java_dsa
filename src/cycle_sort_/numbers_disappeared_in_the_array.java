package cycle_sort_;
import java.util.ArrayList;
import java.util.List;
class numbers_disappeared_in_the_array{

    // Helper method jo do elements ko swap karta hai
    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Method jo 1 se n tak missing numbers ko find karta hai
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length; // Array ki length le lo
        int i = 0; // Index initialize karte hain

        // Array ko rearrange karne ke liye loop
        while (i < n) {
            // Check karo kya current number sahi position par hai
            // ya phir already swap ho chuka hai
            if (nums[i] == i + 1 || nums[i] == nums[nums[i] - 1]) {
                i++; // Next index par chalo
            } else {
                // Number ko uski sahi position par swap karo
                swap(i, nums[i] - 1, nums);
            }
        }

        // Rearranging ke baad missing numbers check karo
        for (int j = 0; j < n; j++) {
            // Agar index j par number j + 1 ke barabar nahi hai, toh wo missing hai
            if (nums[j] != j + 1) {
                ans.add(j + 1); // Missing number ko result mein add karo
            }
        }

        return ans; // Missing numbers ki list return karo
    }

    public static void main(String[] args) {
        numbers_disappeared_in_the_array solution = new numbers_disappeared_in_the_array();

        // Example array jisme kuch numbers missing hain
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        // Disappeared numbers find karo
        List<Integer> result = solution.findDisappearedNumbers(nums);

        // Result print karo
        System.out.println("Disappeared numbers: " + result);
    }
}
