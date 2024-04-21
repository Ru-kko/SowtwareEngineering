package app.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> extends Tree<T> {
  private Queue<Node<T>> queue; // * To wide fill

  public BinaryTree() {
    this.queue = new LinkedList<>();
  }

  @Override
  public void add(T val) {
    if (this.root == null) {
      this.root = new Node<>(val);
      this.queue.add(root);
      return;
    }

    Node<T> current = queue.peek();

    if (current.getLeft() == null) {
      current.setLeft(val);
      this.increase();
      this.queue.add(current.getLeft());
      return;
    }
    if (current.getRight() == null) {
      current.setRight(val);
      this.increase();
      this.queue.add(current.getRight());
      this.queue.poll();
      return;
    }
  }
}
