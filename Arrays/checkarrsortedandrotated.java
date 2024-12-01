package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class checkarrsortedandrotated {
    //(96/109)
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
    //solution
    public boolean check_ans(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }

        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);

        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (arr.equals(sorted)) {
                return true;
            }
            int num = arr.remove(size - 1);
            arr.add(0, num);
        }

        return false;
    }
}
