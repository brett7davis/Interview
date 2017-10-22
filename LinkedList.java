import java.util.*;

public class LinkedList {

	class Node {
		int data;
		Node next;
		Node(int d)  {
			data = d;
			next = null;
		}
	}

	Node newNode(int data) {
       Node x = new Node(data);
       return x;
    }

    Node head;
	//no tail pointer

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

    void SortedInsert(Node new_node) {
    	//case 1 : head null
    	if (head == null) {
    		head = new_node;
    	} 

    	//case 2 : head > new node
    	else if (head.data > new_node.data) {
    		Node temp = head;
    		head = new_node;
    		head.next = temp;
    	}

    	//case 3 : head < new node, no second node
    	else if (head.next == null) {
    		head.next = new_node;
    	}

    	else {
	    	//case 4 : head < new node, has 2nd node
			Node temp = head;
			while (temp.next != null && temp.next.data < new_node.data) {
				temp = temp.next;
			}

			if (temp.next != null) {
				Node temp2 = temp.next;
				temp.next = new_node;
				new_node.next = temp2;
			} else {
				temp.next = new_node;
			}
		}
    }

    void deleteNode(Node head, Node target) {
    	if (target == head) {
    		head = head.next;
    	} else {
    		Node temp = head;
    		while (temp.next != target) {
    			temp = temp.next;
    		}
    		temp.next = temp.next.next; 

    	}
    }

    public static void main(String[] args) {
    	LinkedList roxy = new LinkedList();
    	Node new_node;
    	new_node = roxy.newNode(5);
    	roxy.SortedInsert(new_node);
    	Node new_node1;
    	new_node1 = roxy.newNode(3);
    	roxy.SortedInsert(new_node1);
    	Node new_node2;
    	new_node2 = roxy.newNode(17);
    	roxy.SortedInsert(new_node2);
    	roxy.deleteNode(new_node1,new_node);
    	roxy.printList();
	}
}