class maxSubArray {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        if(nums.length == 0){
            return 0;
        }
        int maxSum=nums[0];
        int curSum=0;
        
       
        
        for(int i=0; i<n; i++){
            curSum = curSum + nums[i];

            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}