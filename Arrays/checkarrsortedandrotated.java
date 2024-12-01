package Arrays;

import java.util.Arrays;

public class checkarrsortedandrotated {
    public boolean check(int[] nums) {
        int [] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        boolean flag = false;
        int j=0;
        for(int i=0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(arr[i] == nums[(i+j)%nums.length]){
                      flag=true;
                      break;
                }
            }
            if(flag==true){
                break;
            }
        }
        System.out.println(j);
        for(int i=0;i<nums.length;i++){
            if(arr[i]!=nums[(i+j)%nums.length]){
                return false;
            }
        }
        return true;
    }
}
