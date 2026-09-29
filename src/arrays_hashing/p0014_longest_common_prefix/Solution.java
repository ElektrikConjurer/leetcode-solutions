package arrays_hashing.p0014_longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        char currenChar;
        boolean charIsSame = true;
        char[] prefixArray = new char[strs[0].length()];
        int count = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            currenChar = strs[0].charAt(i);

            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currenChar) {
                    charIsSame = false;
                }
            }
            
            if (charIsSame) {
                prefixArray[i] = currenChar;
                count++;
            } else break;
        }

        return new String(prefixArray, 0, count);
    }
}
