package app.iterators;

import java.util.ArrayList;
import java.util.List;

import app.binarytree.Node;
import app.binarytree.Tree;

class PreorderFactory<T> implements Route<T> {
  @Override
  public List<T> createRoute(Tree<T> tree) {
    List<T> res = new ArrayList<>(tree.size());
    preorder(tree.getRoot(), res);
    return res;
  }

  private void preorder(Node<T> node, List<T> res) {
    if (node == null) {
      return;
    }
    res.add(node.getValue()); 
    preorder(node.getLeft(), res); 
    preorder(node.getRight(), res); 
  }
}
