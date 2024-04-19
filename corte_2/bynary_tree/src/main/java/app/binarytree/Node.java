package app.binarytree;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
@RequiredArgsConstructor
class Node<T> {
  @NonNull
  private T value;

  private Node<T> left;
  private Node<T> right;

  void setValue(T value) {
    this.value = value;
  }

  void setLeft(T left) {
    this.left = new Node<T>(left);
  }

  void setRight(T right) {
    this.right = new Node<T>(right);
  }
}
