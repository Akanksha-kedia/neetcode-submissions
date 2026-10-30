

class MedianFinder {

    PriorityQueue<Integer> small; // Max Heap
    PriorityQueue<Integer> large; // Min Heap

    public MedianFinder() {
        small = new PriorityQueue<>(Collections.reverseOrder());
        large = new PriorityQueue<>();
    }

    public void addNum(int num) {

        // Step 1: Add to Max Heap
        small.add(num);

        // Step 2: Move largest from small to large
        large.add(small.poll());

        // Step 3: Balance both heaps
        if (large.size() > small.size()) {
            small.add(large.poll());
        }
    }

    public double findMedian() {

        if (small.size() > large.size()) {
            return small.peek();
        }

        return ((double) small.peek() + large.peek()) / 2;
    }
}