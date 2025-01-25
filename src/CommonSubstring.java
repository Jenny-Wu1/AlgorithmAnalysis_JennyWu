public class CommonSubstring {
    public String findCommonSubstring(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int maxLength = 0;
        int endIndex = -1; //the index of the last character in the common substring in text1

        //outer loop loops through each character in text1 array
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t2.length; j++) {
                int currentLength = 0; //length of current substring match
                //checks for common substring starting at t1[i] and t2[j]
                while (i + currentLength < t1.length && j + currentLength < t2.length && t1[i + currentLength] == t2[j + currentLength]) {
                    currentLength++;
                }
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i + currentLength - 1;
                }
            }
        }
        if (maxLength == 0) {
            return "";
        }
        return text1.substring(endIndex - maxLength + 1, endIndex + 1);
    }
}
