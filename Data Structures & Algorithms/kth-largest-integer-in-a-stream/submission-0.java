


class KthLargest {
    PriorityQueue<Integer> heap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;

        heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            heap.offer(num);
        }
    }

    public int add(int val) {
        heap.offer(val);

        PriorityQueue<Integer> temp = new PriorityQueue<>(heap);

        for (int i = 1; i < k; i++) {
            temp.poll();
        }

        return temp.peek();
    }
}
