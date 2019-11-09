package datastructure;

/**
 * implement link list
 * @author Hariom Yadav - Nov 1, 2019
 *
 */

public class LinkList {
	//know something
	static Node head;
	static class Node{
		//know something
		int data;
		Node next;
		//does something

		Node(int v){//memory allocate, and initialize
			data = v;
			next = null;
		}
		
	}
	
	//does something
	static void insert(LinkList list, int value){
		//create new node that store input value
		Node newNode = new Node(value);
		
		//check list length
		if(head == null) {
			head = newNode;
		}else {
			//go to last node
			Node it = head;
			while(it.next != null) {
				it = it.next;
			}
			//now we have last node - add new node
			it.next = newNode;
		}
	}
	
	static void print(LinkList list){//only static method can be access inside main static method
		Node it = head;
		System.out.print("List : ");
		while(it!=null) {
			System.out.print(it.data+" ");
			it = it.next;
		}
		System.out.println("");
	}
	
	public static void main(String[] arg) {
		LinkList list = new LinkList();
		insert(list, 12);print(list);
		insert(list, 121);print(list);
		insert(list, 1211);print(list);
		
	}
}
