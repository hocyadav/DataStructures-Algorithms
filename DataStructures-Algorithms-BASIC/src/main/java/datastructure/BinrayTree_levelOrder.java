package datastructure;

import java.util.LinkedList;
import java.util.Queue;

//ds
//node 

//use of ds
class LevelOrder{
	//know some
	NodeBT root;
	
	//does some
	void printLevel(){
		Queue<NodeBT> qu = new LinkedList<NodeBT>();
		qu.add(root);
		System.out.print("Levelorder : ");
		while(!qu.isEmpty()) {
			NodeBT temp = qu.poll();//return + removes
			System.out.print(temp.data+" ");
			
			if(temp.left != null) {
				qu.add(temp.left);
			}
			if(temp.right != null) {
				qu.add(temp.right);
			}
		}
		System.out.println("");
		
	}
	
}

public class BinrayTree_levelOrder {
	public static void main(String[] args) {
		LevelOrder obj = new LevelOrder();
		obj.root = new NodeBT(1);
		obj.root.left = new NodeBT(2);
		obj.root.right = new NodeBT(3);
		obj.printLevel();
		obj.root.left.left = new NodeBT(4);
		obj.root.left.right = new NodeBT(5);
		obj.root.right.left = new NodeBT(6);
		obj.root.right.right = new NodeBT(7);
		
		obj.printLevel();
		
		
		
		
	}
}
