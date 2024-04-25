package app.binarytree;

public class FindingTree<T> extends Tree<T> {
  public interface Comparator<T> {
    /**
     * Should return a positive number if a > b, negative if a < b or 0 if both are
     * equal
     * 
     * @param a
     * @param b
     * @return
     */
    public Integer compare(T a, T b);
  }

  private Comparator<T> comparator;

  public FindingTree(Comparator<T> comparator) {
    super();
    this.comparator = comparator;
  }

  @Override
  public void add(T val) {
    root = add(root, val);
  }

  private Node<T> add(Node<T> current, T value) {
    if (current == null) {
      super.increase();
      return new Node<T>(value);
    }
    Integer compare = this.comparator.compare(value, current.getValue());

    if (compare == 0) {
      return current;
    }
    if (compare > 0) {
      current.setRight(add(current.getRight(), value));
    }
    if (compare < 0) {
      current.setLeft(add(current.getLeft(), value));
    }

    return current;
  }
}
