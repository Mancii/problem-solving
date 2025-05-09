package arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        // handles only English letters
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

//    handles any character — not just 'a' to 'z'.
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) return false;
//
//        Map<Character, Integer> countMap = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c1 = s.charAt(i);
//            char c2 = t.charAt(i);
//
//            countMap.put(c1, countMap.getOrDefault(c1, 0) + 1);
//            countMap.put(c2, countMap.getOrDefault(c2, 0) - 1);
//        }
//
//        for (int count : countMap.values()) {
//            if (count != 0) return false;
//        }
//
//        return true;
//    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
        System.out.println(va.isAnagram("listen", "silent"));
        System.out.println(va.isAnagram("hello", "world"));
        System.out.println(va.isAnagram("hello", "world"));
    }
}
/*
✅ Definition:
Two strings are anagrams if they contain the same characters in the same frequencies,
but possibly in a different order.
 */
