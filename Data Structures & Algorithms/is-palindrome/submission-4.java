class Solution {
    public boolean isPalindrome(String s) {
        // String st = s;
        // int left = 0;
        // int right = st.length()-1;
        // char[] ch = st.toCharArray();
        // while (left<right) {
        //     if (ch[left] == ch[right]) {
        //         left++;
        //         right--;
        //     }
        //     else {
        //         return false;
        //     }
        // }
        // return true;
        s= s.trim();
        s = s.replaceAll("[^a-zA-Z0-9]", "")
                  .toLowerCase();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return sb.toString().toLowerCase().equals(s.toLowerCase());
    }
}
