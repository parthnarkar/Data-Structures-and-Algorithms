class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0 ;
        int n = nums.length;
        int count = 0;
        for(int j= 1 ; j < n ; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
                count++;
            }
        }

        return i+1;
    }
}
