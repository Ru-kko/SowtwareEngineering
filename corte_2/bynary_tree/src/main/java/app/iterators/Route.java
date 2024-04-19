package app.iterators;

import java.util.List;
import app.binarytree.Tree;

public interface Route<T> {
  public List<T> createRoute(Tree<T> tree);
}
