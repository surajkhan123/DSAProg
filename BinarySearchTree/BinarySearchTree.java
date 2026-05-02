package BinarySearchTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {

  int count = 0;
  Node root;
  boolean flag;

  public boolean add(int key){
    flag = true;
    root = add(root, key);
    if(flag) count++;
    return flag;
  }

  public Node add(Node n, int key){
    if(n == null){
      n = new Node(key);
      return n;
    }

    if(key < n.key)
      n.left = add(n.left, key);
    else if(key > n.key)
      n.right = add(n.right, key);
    else
      flag = false;

    return n;
  }

  public int size(){
    return count;
  }

  public boolean isEmpty(){
    return count == 0;
  }

  public void preOrder(){
    preOrder(root);
  }

  public void postOrder(){
    postOrder(root);
  }

  public void InOrder(){
    InOrder(root);
  }

  public void preOrder(Node n){
    if(n==null) return;
    System.out.println(n.key+" ");
    preOrder(n.left);
    preOrder(n.right);
  }
  public void postOrder(Node n){
    if(n==null) return;
    postOrder(n.left);
    postOrder(n.right);
    System.out.println(n.key+" ");
  }
  public void InOrder(Node n){
    if(n==null) return;
    
    InOrder(n.left);
    System.out.println(n.key+" ");
    InOrder(n.right);
  }

  public void levelOrder(){
    Queue <Node> q = new ArrayDeque<Node>();
    q.add(root);
    Node n = q.poll();
    System.out.println(n.key+" ");
    if(n.left != null)
      q.add(n.left);
    else if(n.right != null)
      q.add(n.right);
  }

  // // missing methods added (same naming as yours)

  // public void preOrder(Node n){
  //   if(n == null) return;
  //   System.out.print(n.key + " ");
  //   preOrder(n.left);
  //   preOrder(n.right);
  // }

  // public void postOrder(Node n){
  //   if(n == null) return;
  //   postOrder(n.left);
  //   postOrder(n.right);
  //   System.out.print(n.key + " ");
  // }

  // public void InOrder(Node n){
  //   if(n == null) return;
  //   InOrder(n.left);
  //   System.out.print(n.key + " ");
  //   InOrder(n.right);
  // }

}