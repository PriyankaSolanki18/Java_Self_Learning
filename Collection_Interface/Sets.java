/*
 * Sets -> set will not gives value in sorted manner, also does'nt have index value
 */
package Collection_Interface;

import java.util.Collection;
import java.util.Iterator;
// import java.util.HashSet;
// import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        //Set  - instead of using Set we can use Collection
        Collection<Integer> nums = new TreeSet<Integer>();  //in place of HashSet we can use TreeSet to get sorted values 
            nums.add(52);
            nums.add(41);
            nums.add(95);
            nums.add(11);
            nums.add(41);

            Iterator<Integer> values = nums.iterator();
            while(values.hasNext())
            System.out.println(values.next());

            // for(int n : nums){
            //     System.out.println(n);
            // }
    }
}
