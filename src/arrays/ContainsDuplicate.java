package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicateUsingHashMap(int[] nums) {
        long startTime = System.nanoTime();
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("HashMap - Duplicate found! Time taken: " + duration + " nanoseconds");
                return true;
            }
            else
                map.put(num,map.getOrDefault(num,0) + 1);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashMap - No duplicates found. Time taken: " + duration + " nanoseconds");
        return false;
    }

    public boolean containsDuplicateUsingHashSet(int[] nums) {
        long startTime = System.nanoTime();
        final Set<Integer> distinct = new HashSet<>();
        for (int num : nums) {
            if(distinct .contains(num)){
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("HashSet - Duplicate found! Time taken: " + duration + " nanoseconds");
                return true;
            }
            distinct.add(num);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("HashSet - No duplicates found. Time taken: " + duration + " nanoseconds");
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate c = new ContainsDuplicate();
        System.out.println(c.containsDuplicateUsingHashMap(new int[]{1,2,3,4,5,6,5,8,9}));
        System.out.println(c.containsDuplicateUsingHashSet(new int[]{1,2,3,4,5,6,5,8,9}));
    }
}
