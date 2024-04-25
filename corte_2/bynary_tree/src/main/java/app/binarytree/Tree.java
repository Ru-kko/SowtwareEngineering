package app.binarytree;

import java.util.List;

import lombok.Getter;

public abstract class Tree<T> {
  private Integer lenght;

  @Getter
  protected Node<T> root;

  protected Tree() {
    this.lenght = 0;
  }

  public abstract void add(T val);

  public void addMany(List<T> values) {
    for (T v : values) {
      this.add(v);
    }
  }

  protected void increase() {
    this.lenght++;
  }

  public Integer size() {
    return this.lenght;
  }
}
