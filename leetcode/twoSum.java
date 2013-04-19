/*
 * scan once with hashmap
 */

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ret = new int[2];
        for (int i=0; i<numbers.length; i++) {
            int num = target - numbers[i];
            if (map.containsKey(num)) {
                ret[0] = map.get(num);
                ret[1] = i+1;
                break;
            }
            else {
                map.put(numbers[i], i+1);
            }
        }
        return ret;
    }
}
