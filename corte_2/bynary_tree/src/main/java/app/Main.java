package app;

import app.binarytree.BinaryTree;
import app.cli.ListFactory;

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

    ListFactory<String> factory = ListFactory.getStringInstance();
    
    var list = factory.get();

    BinaryTree<String> tree = new BinaryTree<>();

    for (String v : list) {
      tree.add(v);
    }
  }
}