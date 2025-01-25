public class CommonSubsequence {
    public int findCommonSubseq(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int commonLength = 0;
        int t2Index = 0;

        //outer loop loops through each character in text1 array
        for (int i = 0; i < t1.length; i++) {
            //inner loop checks for a match in text2 array starting from the last position a match was found
            for (int j = t2Index; j < t2.length; j++) {
                if(t1[i] == t2[j]) {
                    commonLength++;
                    t2Index = j + 1;
                    break; //moves to the next character in text1 after finding match
                }
            }
        }
        return commonLength;
    }
}
