package com.bridgelabz.linkedlist;

public class linked_List <T> {
	
	class Node{
	    T data;
	    Node next;

	    Node(T data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	  
	Node head = null;
	
	public void add( T data) {
		Node newnode = new Node(data);
		
		if(head == null) {    
			head = newnode;
	    }else {
	    	newnode.next = head;
	    	head = newnode;                
	    		        
	    }	    
	}


	public void print() {	        
		Node curr_node = head;	        
		while(curr_node != null){	    
			System.out.print( curr_node.data + " ---> ");
			curr_node = curr_node.next;

		}
		System.out.println(" null");
		  
	}

	public static void main(String[] args) {
	        linked_List linked_list = new linked_List();
	        linked_list.add(70);
	        linked_list.add(30);
	        linked_list.add(56);
	        
	        linked_list.print();
	        
	    }
	    
	}
	    