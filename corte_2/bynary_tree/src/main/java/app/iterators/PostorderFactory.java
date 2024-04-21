package app.iterators;

import java.util.ArrayList;
import java.util.List;

import app.binarytree.Node;
import app.binarytree.Tree;

class PostorderFactory<T> implements Route<T> {

  @Override
  public List<T> createRoute(Tree<T> tree) {
    List<T> res = new ArrayList<>(tree.size());
    postorder(tree.getRoot(), res);
    return res;
  }

  private void postorder(Node<T> node, List<T> res) {
    if (node == null) {
      return;
    }
    postorder(node.getLeft(), res);
    postorder(node.getRight(), res);
    res.add(node.getValue());
  }
}
