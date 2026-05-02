package BinarySearchTree;

public class Node {

  Node left;
  int root;
  Node right;

  Node(int root){
    this.root = root;
  }
  Node(Node left,int root,Node right){
    this.left = left;
    this.root = root;
    this.right = right;
  }
}