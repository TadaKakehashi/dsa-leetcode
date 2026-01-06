package Arrays;

public class question5 {
    public  static int removeDuplicate(int[] nums){
        int k = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,1,1,1,2,2,3,4,4};
        System.out.println(removeDuplicate(arr));
    }
}
