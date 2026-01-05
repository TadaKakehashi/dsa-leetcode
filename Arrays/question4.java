package Arrays;

import java.util.Arrays;

public class question4 {
    public static void moveZeroes(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                 nums[count] = nums[i];
                 count++; 
            }
        }

        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
    }

    public static void moveZeroes_2(int[] nums){
        int pos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {7,0,1,0,4,8,0,0,5};
        
        question4 obj = new question4();
        obj.moveZeroes(nums);
       System.out.println(Arrays.toString(nums));

    }
}
