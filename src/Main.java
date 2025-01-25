import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1. Common Subsequence
        CommonSubsequence CSubseq = new CommonSubsequence();
        String text1 = "abc";
        String text2 = "abc";
        System.out.println("1. Common Subsequence");
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: " + CSubseq.findCommonSubseq(text1, text2));

        text1 = "almanacs";
        text2 = "albatross";
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: " + CSubseq.findCommonSubseq("almanacs", "albatross"));

        text1 = "almanac";
        text2 = "ferris";
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: " + CSubseq.findCommonSubseq("almanac", "ferris"));

        //2. Common Substring
        CommonSubstring CSubstring = new CommonSubstring();
        text1 = "spy family";
        text2 = "jujutzu";
        System.out.println();
        System.out.println("2. Common Substring");
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: \"" + CSubstring.findCommonSubstring(text1, text2) + "\"");

        text1 = "gears of war";
        text2 = "History of warriors";
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: \"" + CSubstring.findCommonSubstring(text1, text2) + "\"");

        text1 = "spy family";
        text2 = "jujutsu kaisen";
        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("Output: \"" + CSubstring.findCommonSubstring(text1, text2) + "\"");

        //3. Not Fibonacci
        Scanner scan = new Scanner(System.in);
        NotFibonacciSequence n = new NotFibonacciSequence();
        System.out.println();
        System.out.println("3. Not Fibonacci");
        System.out.println("Please enter the number of terms you would like to see in the NotFibonacci sequence :): ");
        int numTerms = scan.nextInt();
        scan.close();
        System.out.println("Output of the NotFibonacci Sequence: ");
        long[] sequence = n.generateNotFibonacci(numTerms);
        for(long num : sequence) {
            System.out.print(num + ", ");
        }
        System.out.println();

        //4. Where In
        WhereInSequence w = new WhereInSequence(n);
        int test1 = 10;
        int test2 = 1763;
        System.out.println();
        System.out.println("4. Where In Sequence");
        System.out.println("Input: " + test1);
        System.out.println("Output: " + w.findPosition(test1));
        System.out.println("Input: " + test2);
        System.out.println("Output: " + w.findPosition(test2));

        //5. Remove Element
        RemoveElement r = new RemoveElement();
        //Test case 1
        int[] nums1 = {1, 2, 3, 4, 4, 5, 6, 4, 4,};
        int val1 = 4;
        int result1 = r.remove(nums1, val1);
        System.out.println();
        System.out.println("5. Remove Element");
        System.out.println("Inputs: nums1 = [1, 2, 3, 4, 4, 5, 6, 4, 4], val1 = 4");
        System.out.println("Output: ");
        System.out.print("[");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
        //Test case 2
        int[] nums2 = {3, 2, 2, 3};
        int val2 = 3;
        int result2 = r.remove(nums2, val2);
        System.out.println();
        System.out.println("Inputs: nums2 = [3, 2, 2, 3], val2 = 3");
        System.out.println("Output: ");
        System.out.print("[");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i] + ", ");
        }
        System.out.print("]");

        /* Extra credit (commented out so it doesn't run at the same time as the other algorithms)
        long[] thousandSequence = n.generateNotFibonacci(numTerms);
        for(long num : thousandSequence) {
            System.out.print(num + ", ");
        }
        The NotFibanoacci sequence grows exponentially, causing the numbers to eventually exceed the max value
        of Java's long. It has a recurrence relation of: T(n) = (3 * T(n-1)) + (2 * (T(n-2)) and when n = 1000,
        the numbers become very large, very fast and will cause overflow.
        */

    }
}
