public class MaxSubArraySum {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to start fresh from current element or add to existing sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update global max
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Subarray Sum = " + maxSubArray(arr));
    }

}
