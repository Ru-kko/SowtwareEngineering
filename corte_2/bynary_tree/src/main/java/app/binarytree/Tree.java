package app.binarytree;

import lombok.Getter;

public abstract class Tree<T> {
  @Getter
  protected Node<T> root;

  protected Tree() {}

  public abstract void add(T val);
}
