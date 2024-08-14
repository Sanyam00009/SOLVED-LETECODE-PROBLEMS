class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int [] arr = new int[101];
        int n = nums.size();
        for(int i =0;i<n;i++)
        {
            int start = nums.get(i).get(0);
            int end = nums.get(i).get(1);
            arr[start]++;
            if(end !=100)
            {
                arr[end+1]--;
            }
        }
        int sum =0;
        for(int i =0;i<101;i++)
        {
            sum += arr[i];
            arr[i] = sum;
        }
        int count = 0;
        for(int i =0;i<101;i++)
        {
            if(arr[i]>0)
            {
                count ++;
            }
        }
        return count;
    }
}