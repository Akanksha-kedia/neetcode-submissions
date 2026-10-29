

class Node {
    String val;
    int timestamp;

    Node(String val, int timestamp) {
        this.val = val;
        this.timestamp = timestamp;
    }
}

class TimeMap {
    Map<String, List<Node>> map = new HashMap<>();

    public TimeMap() {
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Node(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        List<Node> nodes = map.get(key);

        String result = "";
        for (Node node : nodes) {
            if (node.timestamp <= timestamp) {
                result = node.val;
            } else {
                break;
            }
        }

        return result;
    }
}
