package stacks;

import java.util.Stack;

public class remove_consecutive_subsequences {

    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && st.peek() == arr[i]) {
                // Remove all consecutive elements
                while (!st.isEmpty() && st.peek() == arr[i]) {
                    st.pop();
                }
            } else {
                st.push(arr[i]);
            }
        }

        int m = st.size();
        int[] res = new int[m];

        // Fill the result array in reverse order since stack is LIFO
        for (int i = m - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        int[] ans = remove(arr);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
