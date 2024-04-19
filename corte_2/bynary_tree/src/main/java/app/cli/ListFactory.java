package app.cli;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListFactory<T> {
  public final static String CLOSE_KEYWORD = "close";

  private final Scanner sc = new Scanner(System.in);
  private String startMessage;
  private String commonMessage;
  private String retryMessage;
  private String numberMessage;
  private Parser<T> parser;

  private static class StringParser implements Parser<String> {
    @Override
    public String getFormat() {
      return null;
    }

    @Override
    public String parse(String msg) throws NumberFormatException, ParseException {
      return msg;
    }
  }

  private ListFactory(Parser<T> parser, String startMessage, String retryMessage, String commonMessage) {
    this.parser = parser;
    this.startMessage = startMessage;
    this.retryMessage = retryMessage;
    this.commonMessage = commonMessage;
  }

  private ListFactory(Parser<T> parser, String startMessage, String retryMessage, String numberMessage,
      String commonMessage) {
    this(parser, startMessage, retryMessage, commonMessage);
    this.numberMessage = numberMessage;
  }

  public static ListFactory<String> getStringInstance() {
    return new ListFactory<>(new StringParser(), "Escriba una palabra", null, "No°%d", "Escriba la palabra");
  }

  public static <E> ListFactory<E> getIntance(Class<E> clazz, Parser<E> parser) {
    return new ListFactory<>(
        parser,
        "Escriba un valor de la forma " + parser.getFormat(),
        "Valor no valido vuelva a intentarlo",
        "N°%d",
        "Escriba el valor");
  }

  public List<T> get() {
    Integer count = 1;
    LinkedList<T> res = new LinkedList<>();
    
    System.out.println(this.startMessage);
    System.out.println("Escriba " + CLOSE_KEYWORD + " para terminar");
    String last = this.sc.nextLine();

    while (!last.trim().toLowerCase().equals(CLOSE_KEYWORD)) {
      try {
        T val = this.parser.parse(last);
        res.push(val);
        count ++;
      } catch (ParseException | NumberFormatException e) {
        System.out.println(this.retryMessage);
      }

      System.out.println(this.commonMessage + " " + String.format(this.numberMessage, count) + ":");
      last = this.sc.nextLine();

      if (last.trim().toLowerCase().equals(CLOSE_KEYWORD)) {
        break;
      }
    }

    return res;
  }
}
