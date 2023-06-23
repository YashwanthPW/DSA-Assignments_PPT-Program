import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       
        Map<Integer, Integer> complementMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{complementMap.get(complement), i};
            }
            
           
            complementMap.put(nums[i], i);
        }
        
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
