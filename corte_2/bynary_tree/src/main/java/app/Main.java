package app;

import java.util.List;

import app.binarytree.FindingTree;
import app.binarytree.Tree;
import app.iterators.Route;
import app.iterators.RouteFactory;

public class Main {
  public static void main(String[] args) {
    // ListFactory<Integer> factory = ListFactory.getIntance(Integer.class, new Parser<Integer>() {
    //   @Override
    //   public String getFormat() {
    //     return "";
    //   }

    //   @Override
    //   public Integer parse(String msg) throws NumberFormatException, ParseException {
    //     return Integer.parseInt(msg);
    //   }
    // });

    // ListFactory<String> factory = ListFactory.getStringInstance();
    
    // var list = factory.get();

    //    6
    //   / \
    //  4   8
    // / \ / \
    //3  5 7  9
    Tree<Integer> tree = new FindingTree<Integer>((a, b) -> a - b);
    tree.add(6);
    tree.add(4);
    tree.add(8);
    tree.add(3);
    tree.add(5);
    tree.add(7);
    tree.add(9);
 
    String order = RouteFactory.INORDER;
    Route<Integer> routeFactory = RouteFactory.getRouteIteratorFactory(order);
    List<Integer> preorder = routeFactory.createRoute(tree);

    System.out.println(order);
    for (Integer str : preorder) {
      System.out.println(str);
    }
  }
}