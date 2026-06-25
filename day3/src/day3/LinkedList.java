package day3;

import day3.LinkedList;

public class LinkedList<L> {

    private class Node {

        private L data;
        private Node next;

        public Node(L data) {
            this.data = data;
        }

        public L getData() {
            return data;
        }
    }

    private Node head, last;
    private int size = 0;

    public void add(L data) {
        Node n = new Node(data);

        if (head == null) 
            head = n;
        else 
            last.next = n;  

        last = n;
        size++;
    }

    public void insert(int idx, L data) {
        if (idx < 0 || idx > size) {
            System.out.println("Index out of bounds");
            return;
        }

        Node n = new Node(data);

        if (idx == 0) {
            n.next = head;
            head = n;

            if (last == null) {
                last = n;
            }

            size++;
        } else {
            Node t = head;
            int count = 1;

            while (count < idx) {
                t = t.next;
                count++;
            }

            n.next = t.next;
            t.next = n;

            if (n.next == null) {
                last = n;
            }

            size++;
        }
    }

    public void remove(int idx) {
    	
    	if(idx == 0) {
    		head = head.next;
    		
    		if(head == null)
    			last = null;
    	
    	size--;
    	return;
    	}
    	
    	Node t = head;
    	
    	for(int i =0;i<idx-1;i++) {
    		t = t.next;
    	}
    	
    	Node removed = t.next;
    	t.next = removed.next;
    	
    	if(removed == last) {
    		last = t;
    	}
    	size--;
    }
    
    public void print() {
        Node t = head;

        while (t != null) {
            System.out.println(t.getData());
            t = t.next;
        }
    }
    public int Size() {
        return size;
    }
}