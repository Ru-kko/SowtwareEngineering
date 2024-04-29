package app.binarytree;

import java.util.Stack;

public class ExpressionTree extends Tree<String> {
  private ExpressionTree(Node<String> root) {
    this.root = root;
  }

  @Override
  public void add(String val) {
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  public static ExpressionTree getIntance(String exp) {
    String[] expression = clean(exp);
    ExpressionTree res = new ExpressionTree(build(expression));

    return res;
  }

  private static Node<String> build(String[] postfix) {
    Stack<Node<String>> st = new Stack<Node<String>>();
    Node<String> t1, t2, temp;

    for (String chr : postfix) {
      if (!isOperator(chr)) {
        temp = new Node<String>(chr);
        st.push(temp);
      } else {
        temp = new Node<String>(chr);

        t1 = st.pop();
        t2 = st.pop();

        temp.setLeft(t2);
        temp.setRight(t1);

        st.push(temp);
      }
    }

    temp = st.pop();
    return temp;
  }

  private static Boolean isOperator(String str) {
    if (str.equals("+")
        || str.equals("-")
        || str.equals("*")
        || str.equals("/")
        || str.equals("^")
        || str.equals("x")) {
      return true;
    }
    return false;
  }

  private static String[] clean(String str) {
    return str.toLowerCase().trim().split("\\s");
  }

}
