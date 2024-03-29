class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyLinkedList {
    int size;
    Node head;
    public MyLinkedList() {
        size = 0;
        head = new Node(0);
    }
    
    public int get(int index) {
        if (index >= size || index < 0) 
            return -1;
        Node current = head;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size || index < 0) 
            return;
        Node current = head;
        
        for(int i = 0; i < index; ++i){
            current = current.next;
        }
        
        Node toAdd = new Node(val);
        toAdd.next = current.next;
        current.next = toAdd;
        ++size;
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) 
            return;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */