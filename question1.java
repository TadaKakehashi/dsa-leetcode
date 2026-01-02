package Arrays;

public class question1{

    public static int[] twoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
            int[] arr = {9,1,12,7,2,15};
            int target = 9;

            int[] result = twoSum(arr, target);

            System.out.println(result[0] + " " + result[1]);
        
    }
}