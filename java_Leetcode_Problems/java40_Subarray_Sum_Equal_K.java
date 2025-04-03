package java_Leetcode_Problems;

public class java40_Subarray_Sum_Equal_K {
    public static void main(String[] args) {

        System.out.println(subarraySum(new int[]{1,2,3},3));
    }

        public static int subarraySum(int[] arr, int k) {
            int n = arr.length; // Get the array size
            int ans = 0; // Variable to store the count of subarrays

            // Traverse the array
            for (int i = 0; i < n; i++) {
                int sum = arr[i]; // Initialize sum with arr[i]

                if (sum == k) { // If the element itself equals k, increment count
                    ans++;
                }

                // Move forward in the array
                for (int j = i + 1; j < n; j++) {
                    sum += arr[j]; // Add elements to sum

                    if (sum == k) { // If sum becomes equal to k, increment answer
                        ans++;
                    }
                }
            }

            return ans; // Return final count
        }
    }


