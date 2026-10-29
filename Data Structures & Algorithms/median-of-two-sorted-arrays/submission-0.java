class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] arr = new int[len1 + len2];

        // Copy both arrays
        System.arraycopy(nums1, 0, arr, 0, len1);
        System.arraycopy(nums2, 0, arr, len1, len2);

        // Sort combined array
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return ((double) arr[n / 2 - 1] + arr[n / 2]) / 2;
        }
    }
}
