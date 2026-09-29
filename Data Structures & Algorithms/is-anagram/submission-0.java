class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            charCount[c - 'a'] -= 1;
        }
        
        for (int i=0; i<charCount.length; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
