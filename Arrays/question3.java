package Arrays;

public class question3 {
    public static int[] twoSumtwo(int[] arr, int target) {
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSumtwo(arr, target);

        if (result.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices (1-based): " + result[0] + ", " + result[1]);
        }
    }
}
