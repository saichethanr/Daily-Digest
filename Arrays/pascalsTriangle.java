package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
        public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> list = new ArrayList<>();
        List <Integer> arr = new ArrayList<>();
        arr.add(1);
        list.add(arr);
        int i=1;
        while(i<numRows){
            List <Integer> a = new ArrayList<>();
            if(arr.size()==1){
                a.add(1);
                a.add(1);
                list.add(a);
            }
            else{
                a.add(1);
                for(Integer n=0;n<arr.size()-1;n++){
                    a.add(arr.get(n)+arr.get(n+1));
                }
                a.add(1);
                list.add(a);
            }
            arr=a;
            i++;
        }
        return list;
    
    }
    
}