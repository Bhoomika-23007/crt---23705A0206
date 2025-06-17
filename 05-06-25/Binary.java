public class Main{
    public static void main(String[] args) {
      BinaryTree t = new BinaryTree(new int[] {1,2,-1,-1,3,-1,-1});
    }
}
class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
}
class BinaryTree{
  Node root;
  BinaryTree(){
    this.root=null;
  }
  public static Node insertNode(Node root,int data){
    if(root==null)return new Node(data);
    if(data>root.data){
      root.right=insertNode(root.right,data);
    }else if(data<root.data){
      root.left=insertNode(root.left,data);
    }
    return root;
  }
}