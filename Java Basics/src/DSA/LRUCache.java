package DSA;
//LRU Cache — LinkedHashMap (asked at design-coding level)

import java.util.*;

public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // accessOrder=true → moves accessed entry to tail automatically
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(3);
        lru.put(1, 10); lru.put(2, 20); lru.put(3, 30);
        System.out.println(lru.get(1)); // 10  — marks 1 as recently used
        lru.put(4, 40);                 // evicts 2 (least recently used)
        System.out.println(lru.get(2)); // -1  — evicted
        System.out.println(lru.get(3)); // 30
    }
}
