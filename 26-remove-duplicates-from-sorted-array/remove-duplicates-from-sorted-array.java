class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int ucount = 1;
        for(int i =1;i<size;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[ucount++]=nums[i];
            }
        }
        return ucount;
    }
}