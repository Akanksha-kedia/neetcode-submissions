


class LRUCache {
    HashMap<Integer, Integer> map = new HashMap<>();
    HashMap<Integer, Long> usage = new HashMap<>();

    int capacity;
    long counter = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        // Mark this key as recently used
        usage.put(key, ++counter);

        return map.get(key);
    }

    public void put(int key, int value) {
        // If key already exists, update its value
        if (map.containsKey(key)) {
            map.put(key, value);
            usage.put(key, ++counter);
            return;
        }

        // Evict the least recently used key if full
        if (map.size() == capacity) {
            int lruKey = -1;
            long oldest = Long.MAX_VALUE;

            for (int k : usage.keySet()) {
                if (usage.get(k) < oldest) {
                    oldest = usage.get(k);
                    lruKey = k;
                }
            }

            map.remove(lruKey);
            usage.remove(lruKey);
        }

        // Insert the new key
        map.put(key, value);
        usage.put(key, ++counter);
    }
}
