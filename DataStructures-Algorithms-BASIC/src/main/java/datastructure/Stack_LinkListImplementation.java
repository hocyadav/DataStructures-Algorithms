package datastructure;

/**
 * 
 * @author Hariom Yadav - Nov 3, 2019
 *
 */

class Node1{
	int data;
	Node1 next;
	Node1(int v){
		data = v;
	}
}

class StackLL{
	//know something
	Node1 headTop;
	
	//does something
	public StackLL() {
		headTop = null;
	}
	
	void push(int v){
		//1st node
		Node1 newNode = new Node1(v);
		if(headTop == null) {
			headTop = newNode;
		}else {//add before headTop
			newNode.next = headTop;
			headTop = newNode;
		}
	}
	
	void pop() {
		if(headTop == null) {
			System.out.println("Underflow");
			return;
		}
		headTop = headTop.next;
	}
	
	int top() {
		if(headTop == null) {
			System.out.println("empty");
			return -1;
		}
		return headTop.data;
	}
	
	void print() {
		Node1 temp = headTop;
		System.out.print("Stack : ");
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
}

public class Stack_LinkListImplementation {

	public static void main(String[] args) {
		StackLL obj = new StackLL();
		obj.push(11);obj.print();
		obj.push(21);obj.print();
		obj.push(23);obj.print();
		obj.pop();obj.print();
		obj.pop();obj.print();
		obj.pop();obj.print();
		obj.pop();obj.print();
	}

}
