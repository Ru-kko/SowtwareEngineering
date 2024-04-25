package app.iterators;

public class RouteFactory {
  public static <T> Route<T> getRouteIteratorFactory(RoteOrder factoryType) {
    return switch (factoryType) {
      case PREORDER -> new PreorderFactory<>();
      case POSTORDER -> new PostorderFactory<>();
      case INORDER -> new InorderFactory<>();
      default -> null;
    };
  }
}
