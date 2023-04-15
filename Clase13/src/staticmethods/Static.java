package staticmethods;

public class Static {
  // static private String sentence = "frist sentence";
  public static Integer add(Integer a, Integer b) {
    return  a + b;
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Result of 4 + 5 is: " + add(4, 5));

    // Static.sentence = "Hello world";
    // Static.sentence = "Second sentence";

    // System.out.println(Static.sentence);
    // System.out.println(Static.sentence);
  }
}