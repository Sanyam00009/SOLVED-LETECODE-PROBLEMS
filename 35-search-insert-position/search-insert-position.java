class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int i =0,ans=0,count=0;
        for( i = 0; i<size;i++)
        {
            count++;
            if(nums[i]==target)
            {
                ans = i;
            }
            else if(nums[i]<target)
            {
                 ans = count;
            }
            
           
        }return ans;
 }
}
