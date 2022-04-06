public class SolutionFind53 {
    public int missingNumber(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int mid;
        while(i<=j&&i>=0&&j<nums.length){
            mid=(i+j)/2;
            if(nums[mid]==mid){
                i=mid+1;
            }else{
                if(mid==0){return 0;}
                if(nums[mid-1]==mid-1){
                    return mid;
                }else{
                    j=mid-1;
                }
            }

        }
        return nums.length;
    }
}
