import java.util.HashMap;
import java.util.Map;

public class Solution53 {
    public static int search(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        if(map.containsKey(target)){
            return map.get(target);
        }else{return -1;}
    }
    public static int search2(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int mid;
        boolean flag=true;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                i=mid;
                j=mid;
                while(flag){
                    flag=false;
                    if(i>=0) {
                        if (nums[i] == target) {
                            i--;
                            flag = true;
                        }
                    }
                    if(j<nums.length) {
                        if (nums[j] == target) {
                            j++;
                            flag = true;
                        }
                    }
                }
                return j-i-1;

            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }



        }
        return 0;

    }
    public static void main(String[] args) {
        int[] a= {1};
        System.out.println(search2(a,1));
    }
}
