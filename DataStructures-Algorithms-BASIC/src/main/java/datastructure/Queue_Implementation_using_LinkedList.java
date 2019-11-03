package datastructure;
/**
 * 
 * @author Hariom Yadav - Nov 3, 2019
 *Queue impl using LinkedList - only difference is DS int toNode
 */

//data structure
class NodeQ{
	int data;
	NodeQ next;
	NodeQ(int i){//no need to initialize next pointer, since by default constructor initialize null for non-primitive data structres
		data = i;
	}
}

//use of ds
class QueueLL{
	//know something
	NodeQ front, rear;//size not required, dynamic inc size since this is LL
	
	//does something
	void enQ(int v){//rear++ and add
		//create new node
		NodeQ nn = new NodeQ(v);
		if(rear == null) {
			rear = front = nn;
		}else {
			rear.next = nn;//make connection
			rear = nn;//update last pointer
		}
	}
	
	void deQ(){
		if(front ==null) {
			System.out.println("underflow - empty Queue");
			return;
		}
		front = front.next;
	}
	
	boolean isEmpty() {
		return (front == rear)?true:false;
	}
	
	void print() {
		NodeQ temp = front;
		System.out.print("Queue : ");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
}


public class Queue_Implementation_using_LinkedList {
	public static void main(String[] args) {
		QueueLL obj = new QueueLL();
		System.out.println("Queue Empty : "+obj.isEmpty());
		obj.deQ();obj.print();
		obj.enQ(1);obj.print();
		obj.enQ(2);obj.print();
		obj.enQ(3);obj.print();
		obj.enQ(4);obj.print();
		System.out.println("Queue Empty : "+obj.isEmpty());
		obj.deQ();obj.print();
		obj.deQ();obj.print();
		obj.deQ();obj.print();
		obj.deQ();obj.print();
		obj.deQ();obj.print();
		
	}
}
