package string.manipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class work_rough {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0 ; i <nums.length ;i++){
            hash.put(nums[i],i);
        }
        int j;
        for(int i=0 ; i <nums.length ;i++){
            j = target - nums[i];
            if(j<1 || nums[i]==j){
                continue;
            }
            if(hash.containsKey(j)){
                ans[0]=i;
                ans[1]=hash.get(j);
                break;
            }

        }

        return ans;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {

        int[] arr = new int[] {3,2,4};

        arr = twoSum(arr,6);

    }
}