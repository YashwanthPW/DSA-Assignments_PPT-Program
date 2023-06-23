public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertIndex = 0; 
// Index to insert non-zero elements
        
        // Iterate through the array
        for (int num : nums) {
            if (num != 0) {
                nums[insertIndex] = num; 
                insertIndex++;
            }
        }
        
        // Fill the remaining indices with zeros
        while (insertIndex < nums.length) {
            nums[insertIndex] = 0;
            insertIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
