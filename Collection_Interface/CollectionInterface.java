package Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        // nums.add("7");  //Runtime Exception if we doesn't include type <Integer>
        
        System.out.println(nums.indexOf(1));
        
        System.out.println(nums.get(2));

        // for(int n : nums){
        //     int num = (Integer)n;
        // System.out.println(num*2);
        // }
    }
}
