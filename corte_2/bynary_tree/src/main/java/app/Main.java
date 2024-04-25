package app;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import app.binarytree.FindingTree;
import app.binarytree.Tree;
import app.cli.ListFactory;
import app.cli.Parser;
import app.iterators.RoteOrder;
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

    ListFactory<Integer> factory = ListFactory.getIntance(new Parser<Integer>() {
      @Override
      public String getFormat() {
        return "";
      }
      @Override
      public Integer parse(String msg) throws NumberFormatException, ParseException {
        return Integer.parseInt(msg);
      }
    });

    List<Integer> data = factory.get();

    Tree<Integer> tree = new FindingTree<Integer>((a, b) -> a - b);
    tree.addMany(data);
    
 
    Route<Integer> routeFactory = getFactory();
    List<Integer> route = routeFactory.createRoute(tree);

    for (Integer str : route) {
      System.out.println(str);
    }
    
    System.out.println("Size: " + tree.size());
  }

  private static <T> Route<T> getFactory() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escriba el orden a seguir " + Arrays.toString(RoteOrder.values()));

    String route = sc.nextLine();
    sc.close();
    try {
      RoteOrder order = RoteOrder.valueOf(route.trim().toUpperCase());
      return RouteFactory.getRouteIteratorFactory(order);
    } catch (NoSuchElementException e) {
      System.out.println("Valor no valido: " + route + " vuelva a intentarlo");
      return Main.getFactory();
    }
  }
}