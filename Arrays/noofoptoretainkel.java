package Arrays;

import java.util.ArrayList;
import java.util.List;

public class noofoptoretainkel {
     public int minOperations(List<Integer> nums, int k) {
        List <Integer> list = new ArrayList<>();
        for(int i=1;i<=k;i++){
            list.add(i);
        }
        Integer done =0;
        Integer ans =0;
        while(nums.size()!=0){
            if(list.contains(nums.get(nums.size()-1))){
                done++;
            }
            ans++;
            if(done==k){
                break;
            }
            list.remove(nums.get(nums.size()-1));
            nums.remove(nums.size()-1);
        }
        return ans;
    } 
}
