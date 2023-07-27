package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> sourceItem : sourceMap.entrySet()) {
            if (map.containsKey(sourceItem.getValue())) {
                if (sourceItem.getKey() < map.get(sourceItem.getValue())) {
                    map.put(sourceItem.getValue(), sourceItem.getKey());
                }
            } else {
                map.put(sourceItem.getValue(), sourceItem.getKey());
            }
        }
        return map;
    }
}
