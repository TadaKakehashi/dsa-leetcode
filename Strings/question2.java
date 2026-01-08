package Strings;
import java.util.Arrays;

public class question2 {

    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        int index = 0;

        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return str1.substring(0, index);
    }

    // MAIN METHOD FOR TESTING
    public static void main(String[] args) {

        question2 sol = new question2(); // 👈 IMPORTANT LINE

        // Test case 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(sol.longestCommonPrefix(strs1)); // fl

        // Test case 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(sol.longestCommonPrefix(strs2)); // ""

        // Test case 3
        String[] strs3 = {"interspecies", "interstellar", "interstate"};
        System.out.println(sol.longestCommonPrefix(strs3)); // inter

        // Test case 4
        String[] strs4 = {"a"};
        System.out.println(sol.longestCommonPrefix(strs4)); // a

        // Test case 5
        String[] strs5 = {"", "b"};
        System.out.println(sol.longestCommonPrefix(strs5)); // ""
    }
}