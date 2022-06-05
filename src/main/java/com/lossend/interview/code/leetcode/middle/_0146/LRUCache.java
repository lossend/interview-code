package com.lossend.interview.code.leetcode.middle._0146;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    public class Node {
        int key;
       int value;
    }
    private int capacity;
    private LinkedList<Node> deque;
    private Map<Integer, Node> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.deque = new LinkedList<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        deque.remove(node);
        deque.addFirst(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = new Node();
        node.value = value;
        node.key = key;
        Node old = map.get(key);
        if (map.size() < capacity) {
            if (old != null) {
               deque.remove(old);
            }
            map.put(key, node);
            deque.addFirst(node);
        } else {
            if (old != null) {
                deque.remove(old);
            } else {
                Node removeNode = deque.removeLast();
                map.remove(removeNode.key);
            }
            map.put(key, node);
            deque.addFirst(node);
        }
    }
}
