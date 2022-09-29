class LRUCache {
    HashMap<Integer,Node> cache;
    int size, capacity;
    Node head;
    Node tail;
    
    class Node{
        int key, value;
        Node prev;
        Node next;
    }
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node();
        tail = new Node();
        
        head.next = tail;
        tail.next = null;
        
        head.prev = null;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node = cache.get(key);
        remove(node);
        movetohead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node existing_node = cache.get(key);
        if(existing_node != null){
            remove(existing_node);
            size--;
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        cache.put(key, node);
        
        movetohead(node);
        size++;
        
        if(size > capacity)
            poptail();
    }
    
    public void remove(Node node){
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
    }
    
    public void movetohead(Node node){
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }
    public void poptail(){
        Node last = tail.prev;
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