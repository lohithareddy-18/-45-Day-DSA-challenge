class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2}; // Example input
        Solution sol = new Solution(); // Create an instance of Solution
        int newLength = sol.removeDuplicates(nums); // Call the instance method
        System.out.println("The new length is: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
