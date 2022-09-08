package Bi_Weekly_Contest.Easy;
import java.util.*;;
public class Leetcode2395_BC86 {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> res = new HashSet<Integer>();
        for(int i=0;i<nums.length-2;i++){
            res.add(nums[i]+nums[i+1]);
            if(res.contains((nums[i+1]+nums[i+2])))
                return true;
        }
         return false;
    }
}
