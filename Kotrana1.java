import java.util.Arrays;

public class Kotrana1 {
    public int special(int[] nums){
        Arrays.sort(nums);
        int x = 1;
        while (x <= nums.length){
            if (x == nums.length && nums[0]>=x){
                return x;
            }else if (x < nums.length && nums[0]>=x){
                x+=1;
            } else nums = Arrays.copyOfRange(nums, 1, nums.length);
        }
        return -1;
    }
}
