class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =1;
        int right = numbers.length;

        while(left < right){
            int sum = numbers[left-1]+ numbers[right-1];
            if(sum >target){
                right --;
            }else if (sum < target){
                left ++;
            } else {
                return new int[]{left, right};
            }
        }
        return null;
    }
}