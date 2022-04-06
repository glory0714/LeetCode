import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for(int num : nums) {
            if(dic.contains(num)) return num;
            dic.add(num);
        }
        return -1;
    }

    public int findRepeatNumber2(int[] nums) {
        int i=0;
        int tmp=0;
        while(i<nums.length){
            if(nums[i]!=i){
                if(nums[nums[i]]==nums[i]){
                    return nums[i];
                }else{
                    tmp=nums[nums[i]];
                    nums[nums[i]]=nums[i];
                    nums[i]=tmp;
                }

            }

            i++;
        }
        return -1;
    }
}
