package slidingwindow;

public class shortestwithORleastk {
    public int minimumSubarrayLength(int[] nums, int k) {
        int l=0;
        int r=0;
        int sum=0;
        Integer len = Integer.MAX_VALUE;
        while(r<nums.length){
            sum = sum | nums[r];
            while(sum>=k && l<=r){
                len = Math.min(len,(r-l+1));
                sum = 0;
                for (int i = l + 1; i <= r; i++) {
                    sum = sum | nums[i];
                }
                l++;
            }
            r++;
        }
        if(len==Integer.MAX_VALUE){
            return -1;
        }
        return len;
    }
}
