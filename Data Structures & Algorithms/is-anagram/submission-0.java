class Solution {
    public boolean isAnagram(String s, String t) {
        String cleanStr1 = s.replaceAll("\\s", "").toLowerCase();
        String cleanStr2 = t.replaceAll("\\s", "").toLowerCase();

        if(cleanStr1.length() != cleanStr2.length()){
            return false;
        }

        char[] charArray1 = cleanStr1.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);


    }
}
