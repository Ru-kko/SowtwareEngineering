package app.iterators;

public class RouteFactory {
  public final static String PREORDER = "PREORDER";
  public final static String POSTORDER = "POSTORDER";
  public final static String INORDER = "INORDER";

  public static <T> Route<T> getRouteIteratorFactory(String factoryType) {
    return switch (factoryType) {
      case PREORDER -> new PreorderFactory<>();
      case POSTORDER -> new PostorderFactory<>();
      case INORDER -> new InorderFactory<>();
      default -> null;
    };
  }
}
