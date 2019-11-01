package datastructure;
/**
 * constructor with 1 arg, insert method
 * @author Hariom Yadav - Nov 1, 2019
 *
 */

//data structure
class Node{
	int data;
	Node next;
	Node(int v){
		data = v;
	}
}
//logic on that data structure
class LList{
	//know something - fields/variable
	Node head;
	
	//does something
	void insert(int value) {
		//create new node
		Node newNode = new Node(value);
		
		if(head == null) {//empty list
			head = newNode;
		}else {
			Node tempItr = head;
			while(tempItr.next != null) {
				tempItr = tempItr.next;
			}
			tempItr.next = newNode;
		}
	}
	void print() {
		Node temp = head;
		System.out.print("List : ");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	
}

//testing data structure 
public class LinkList_Implementation {

	public static void main(String[] args) {
		
		LList obj = new LList();
		obj.insert(12);obj.print();
		obj.insert(122);obj.print();
		obj.insert(11112);obj.print();

	}

}
