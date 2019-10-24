package com.datastructure;

public class Stack_ArrayImplementation {
	//declare global variable
	static int stackSize	= 11;
	static int[] stack 	= new int[stackSize];
	static int top 		= -1;

	static void push(int x){//increment TOP and add && check overflow condition
		if(top == stackSize-1) {
			System.out.println("STACK : overflow - no space left");
			return;
		}
		stack[++top] = x;
	}
	
	static void pop(){//here pop implementaion : only decrement top
		top--;
	}
	int top(){//get top element && return only if not empty
		return stack[top];
	}
	static void print(){
		System.out.print("STACK : ");
		for(int i=0; i<=top; i++) {
			System.out.print(" "+stack[i]);
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		push(1); print();
		push(3); print();
		push(6); print();
		pop(); print();
		push(11); print();
		push(14); print();
		push(155); print();
		push(13); print();
		push(17); print();
		push(123); print();
		push(19); print();
		push(144); print();
		push(15); print();//overflow - only work we we change value stackSize to 11
		
	}

}
