class LRUCache {
Map<Integer, DLinkedNode> cache;
    int size;
    int capacity;
    DLinkedNode head;
    DLinkedNode tail;
    
    class DLinkedNode{
        int key, val;
        DLinkedNode prev;
        DLinkedNode next;
    }
    
    private void moveToHead(DLinkedNode node){
        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }
    
    private void deleteNode(DLinkedNode node){
        
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap();
        
        head = new DLinkedNode();
        head.prev = null;
        
        tail = new DLinkedNode();
        tail.prev = head;
        tail.next = null;
        head.next = tail;
    }
    
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        
        DLinkedNode node = cache.get(key);
        deleteNode(node);
        moveToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        DLinkedNode existingNode = cache.get(key);
        if(existingNode != null){
            deleteNode(existingNode);
            --size;
        }
        
        DLinkedNode newNode = new DLinkedNode();
        newNode.val = value;
        newNode.key = key;
        cache.put(key, newNode);
        
        moveToHead(newNode);
        ++size;
        
        if(size > capacity){
            popTail();
        } 
    }
    
    private void popTail(){
        DLinkedNode prevTail = tail.prev;
        cache.remove(prevTail.key);
        deleteNode(prevTail);
        --size;
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */