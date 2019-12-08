package part4_utilizing_design_patterns.structural;

import java.util.HashMap;

public class FixSizeHashMap<K, V> {

    private HashMap<K, V> hashMap;
    private int size;

    public FixSizeHashMap(int size) {
        hashMap = new HashMap<K, V>();
        this.size = size;
    }

    public boolean put(K key, V val) {
        if (hashMap.size() < size) {
            hashMap.put(key, val);
            return true;
        } else {
            System.out.println("Reached max size " + size + ", cannot add new entry <" + key + ", " + val + ">");
            return false;
        }
    }
}
