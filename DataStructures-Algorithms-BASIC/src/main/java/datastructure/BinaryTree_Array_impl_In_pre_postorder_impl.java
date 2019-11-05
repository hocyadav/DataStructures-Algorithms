package datastructure;

//import sun.security.mscapi.KeyStore.ROOT;

//data str
class NodeBT {
	//know some
	int data;
	NodeBT left, right;
	
	//does some
	NodeBT(int v){//not a mtrhod
		data = v;
		left = right = null;
	}
	
}
//use of DS
class Binary{
	//know some
	NodeBT root;
	
	void inorder() {
		System.out.print("Inorder LNR: ");
		inrec(root);
		System.out.println("");
	}
	private void inrec(NodeBT r) {
		if(r == null) {
			return;
		}else {
			inrec(r.left);
			System.out.print(r.data+" ");
			inrec(r.right);
		}
	}
	
	void preorder() {
		System.out.print("Preorder NLR: ");
		pre(root);
		System.out.println("");
	}
	private void pre(NodeBT preRoot) {
		if(preRoot == null) {
			return;
		}else {
			System.out.print(preRoot.data+" ");
			pre(preRoot.left);
			pre(preRoot.right);
		}
	}
	void postorder() {
		System.out.print("Postorder LRN: ");
		post(root);
		System.out.println("");
	}
	private void post(NodeBT r2) {
		if(r2 == null) {
			return;
		}else {
			post(r2.left);
			post(r2.right);
			System.out.print(r2.data+" ");
		}
	}
}


public class BinaryTree_Array_impl_In_pre_postorder_impl {
	public static void main(String[] args) {
		Binary obj = new Binary();
		obj.root = new NodeBT(1);
		
		obj.root.left = new NodeBT(2);
		obj.root.right = new NodeBT(3);
		
		obj.root.left.left = new NodeBT(4);
		obj.root.left.right = new NodeBT(5);
		
		obj.root.right.left = new NodeBT(6);
		obj.root.right.right = new NodeBT(7);
		
		obj.inorder();
		obj.preorder();
		obj.postorder();
	}
}
