package app.iterators;

import java.util.ArrayList;
import java.util.List;

import app.binarytree.Node;
import app.binarytree.Tree;

class InorderFactory<T> implements Route<T> {

  @Override
  public List<T> createRoute(Tree<T> tree) {
    List<T> res = new ArrayList<>(tree.size());
    inorder(tree.getRoot(), res);
    return res;
  }

  private void inorder(Node<T> node, List<T> res) {
    if (node == null) {
      return;
    }
    inorder(node.getLeft(), res);
    res.add(node.getValue());
    inorder(node.getRight(), res);
  }

}
