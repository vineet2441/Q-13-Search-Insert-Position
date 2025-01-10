class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        for(int i=0;i <nums.length; i++){
            if(nums[i]==target){
               return i ;
            }
            else if(target<nums[i]){
                return i;
            }
            else if(target>nums[nums.length-1]){
                a=nums.length;
            }
        }
        return a;
    }
}
