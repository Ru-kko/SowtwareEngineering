package app.binarytree;

import lombok.Getter;

public abstract class Tree<T> {
  private Integer lenght;

  @Getter
  protected Node<T> root;

  protected Tree() {
    this.lenght = 0;
  }

  
  public abstract void add(T val);
  
  protected void increase() {
    this.lenght ++;
  }

  public Integer size() {
    return this.lenght;
  }
}
