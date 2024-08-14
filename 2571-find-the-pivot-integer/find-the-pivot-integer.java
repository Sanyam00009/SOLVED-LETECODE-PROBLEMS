class Solution {
    public int pivotInteger(int n) {
        int low = 1;
        int high = n;
        int totalsum = n*(n+1)/2;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int leftsum = mid*(mid+1)/2;
            
            int rightsum = totalsum - leftsum +mid;
            if(leftsum == rightsum)
            {
                return mid;
            }
            else if(leftsum < rightsum)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}