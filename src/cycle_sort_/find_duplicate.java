package cycle_sort_;


import java.util.Arrays;

    class find_duplicate {

        // Helper method to swap two elements in the array
        void swap(int i, int j, int[] nums) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Method to find the duplicate number in the array
        public int findDuplicate(int[] nums) {
//           first method
            while(true){
                int ele =nums[0];
                if(nums [ele]==ele)return ele;
                swap(0,ele,nums);
            }




//            second method
//            int n = nums.length; // Array ki length le lo
//            int i = 0; // Index initialize karte hain


            // Rearrange the array
//            while (i < n) {
//                // Check if the current number is at its correct position
//                // or if the number is already swapped with its correct position
//                if (nums[i] == i + 1 || nums[i] == nums[nums[i] - 1]) {
//                    i++; // Move to the next index
//                } else {
//                    // Swap the number to its correct position
//                    swap(i, nums[i] - 1, nums);
//                }
//            }
//
//            // Check for the duplicate number
//            for (int j = 0; j < n; j++) {
//                // If the number at index j is not j + 1, it is the duplicate
//                if (nums[j] != j + 1) {
//                    return nums[j]; // Return the duplicate number
//                }
//            }
//
//            return 0; // Return 0 if no duplicate found (shouldn't happen in valid input)
//        }
        }
        public static void main(String[] args) {
            find_duplicate solution = new find_duplicate();

            // Example array with a duplicate number
            int[] nums = {1, 3, 4, 2, 2};

            // Find the duplicate number
            int result = solution.findDuplicate(nums);

            // Output the result
            System.out.println("Duplicate number: " + result);
        }
    }
