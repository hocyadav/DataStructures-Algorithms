package datastructure;
/**
 * 
 * @author Hariom Yadav - Nov 3, 2019
 *
 */
//data structure - array
//use of ds
class Queue{
	//know something
	int front, rear;
	int size;
	int[] queue;
	
	//does something
	Queue(int s) {
		front = 0; rear = 0;
		size = s;
		queue = new int[size];
	}
	
	//insert - 
	//Time Complexity of Enqueue : O(1)
	void enQueue(int v) {//rear++ & add (in stack top++ & add)
		if(rear == size) {
			System.out.println("Overflow");
			return;
		}
		queue[rear++] = v;
	}
	//Time Complexity of Dequeue : O(n)
	void deQueue() {
		if(front == rear) {
			System.out.println("Underflow - nothing to delete");
			return;
		}else {
			for(int i=0; i<rear-1;i++) {//move 1 step left
				queue[i] = queue[i+1];
			}
			--rear;//no need to do queu[rear] = 0
		}
	}
	
	void print() {
		System.out.print("Queue : ");
		for(int i=0;i<rear;i++) {//no equal to real becaue after enqueue rear in incrementing
			System.out.print(queue[i]+" ");
		}
		System.out.println("");
	}
	
}

public class Queue_ArrayImplementation_using_Array {
	public static void main(String[] arg) {
		Queue obj = new Queue(4);
		obj.deQueue();obj.print();
		obj.enQueue(1);obj.print();
		obj.enQueue(2);obj.print();
		obj.enQueue(2);obj.print();
		obj.enQueue(2);obj.print();
		obj.enQueue(2);obj.print();//overflow
		obj.deQueue();obj.print();
		obj.deQueue();obj.print();
		obj.deQueue();obj.print();
	}
}
