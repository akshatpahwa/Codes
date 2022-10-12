class LRUCache {
    HashMap<Integer,Node> cache;
    int size, capacity;
    Node head;
    Node tail;
    
    class Node{
        int key, value;
        Node pre;
        Node next;
    }
    
    public LRUCache(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        
        head.next = tail;
        tail.next = null;
        
        head.pre = null;
        tail.pre = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key))
            return -1;
        Node node = cache.get(key);
        remove(node);
        movetohead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);
        if(cache.containsKey(key)){
            remove(node);
            size--;
        }
        Node new_node = new Node();
        new_node.key = key;
        new_node.value = value;
        cache.put(key, new_node);
        
        movetohead(new_node);
        size++;
        
        if(size > capacity)
            poptail();
    }
    
    public void remove(Node node){
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
    }
    
    public void movetohead(Node node){
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }
    
    public void poptail(){
        Node last = tail.pre;
        remove(last);
        cache.remove(last.key);
        size--;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */