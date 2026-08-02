class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            hm.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (hm.containsKey(complement) && hm.get(complement) != i) {
                res[0] = i+1;
                res[1] = hm.get(complement)+1;
                break;
            }
        }

        return res;
    }
}