package arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        return Arrays.stream(nums2)
                .filter(set1::contains)
                .distinct()
                .toArray();
    }
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] intersection1 = intersection.
                intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        System.out.println(Arrays.toString(intersection1));

    }
}
