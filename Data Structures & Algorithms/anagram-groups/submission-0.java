class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];

            for(char ch : str.toCharArray()){
                count[ch -'a']++;
            }

            String key = Arrays.toString(count);

            // if the key dont exist. create a new empty list for that key.
            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            // now we know the list exists, get it and add the str.
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }
}
