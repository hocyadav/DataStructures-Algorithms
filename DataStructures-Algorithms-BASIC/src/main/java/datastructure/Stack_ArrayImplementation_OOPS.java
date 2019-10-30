package datastructure;
/**
 * @author yadha02
 * same implementation as Stack_ArrayImplementaion -> only difference is we are using obj
 * Problem : no dynamic increment
 */
class Stack{
	//global variable - only declaration --> initialization happen during constructor call
	int stackSize = 10;
	int top;
	int[] stack = new int[stackSize];
	Stack(){
		top = -1; 
	}
	
	void push(int value){//increment top & update 
		if(top == stackSize-1) {
			System.out.println("STACK Error : overflow - no space left");
			return;
		}
		stack[++top]	= value;
	}
	
	void pop() {//decrement top only && check underflow condition
		if(top == -1) {
			System.out.println("STACK Error : underflow - no data to pop");
			return;
		}
		top--;
	}
	int top() {//return top element && check underflow condition
		return (top==-1)? -1 : stack[top];
	}
	boolean isEmpty(){
		return (top == -1)? true : false;
	}
	void printStack(){
		System.out.print("STACK : ");
		for(int i=0; i<=top; i++) {
			System.out.print(" "+stack[i]);
		}
		System.out.println("");
	}
}
public class Stack_ArrayImplementation_OOPS {

	public static void main(String[] args) {
		Stack stackObj = new Stack();
		
		System.out.println(stackObj.isEmpty());
		System.out.println("1st time top: "+stackObj.top());
		stackObj.pop();
		stackObj.push(11); stackObj.printStack();
		stackObj.push(111); stackObj.printStack();
		stackObj.pop(); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();
		stackObj.push(123); stackObj.printStack();//10 element added
		stackObj.push(123); stackObj.printStack();// overflow - no space
		System.out.println(stackObj.isEmpty());
		

	}

}
