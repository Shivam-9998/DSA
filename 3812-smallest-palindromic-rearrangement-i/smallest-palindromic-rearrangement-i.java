class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            int count = freq[i];

            for (int j = 0; j < count / 2; j++) {
                left.append((char) (i + 'a'));
            }

            if (count % 2 == 1) {
                middle.append((char) (i + 'a'));
            }
        }

        String right = new StringBuilder(left).reverse().toString();

        return left.toString() + middle.toString() + right;

    }
}