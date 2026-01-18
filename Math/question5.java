package Math;

import java.util.HashSet;
import java.util.Set;

public class question5 {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println(singleNumber(arr));
    }
}
