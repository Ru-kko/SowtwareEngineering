package datastructs.util;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadList<T> {
  private Scanner sc;
  private IParser<T> parser;
  private Integer limit;
  private Integer leftLimit;
  private Boolean allowBreak = true;

  public ReadList(IParser<T> parser) {
    this.sc = new Scanner(System.in);
    this.parser = parser;
  }

  public ReadList(IParser<T> parser, Boolean allowBreak) {
    this(parser);
    this.allowBreak = allowBreak;

  }

  public ReadList(IParser<T> parser, Integer limit, Boolean allowBreak) {
    this(parser, allowBreak);
    this.limit = limit;
  }

  public List<T> read() {
    List<T> res = new LinkedList<>();
    Integer counter = 0;

    if (this.allowBreak) {
      System.out.println("Use la palabra \"stop\", para terminar");
    }

    while (this.limit == null || counter < this.limit) {
      String val = this.sc.nextLine();

      if (val.trim().toLowerCase().equals("stop") && this.allowBreak) {
        if (leftLimit == null || counter >= leftLimit - 1) {
          return res;
        }

        System.out.println("Se nesecita un minimo de " + this.leftLimit + " valores");
      }

      try {
        T parsed = this.parser.parse(val);
        res.add(parsed);
      } catch (NumberFormatException | ParseException e) {
        System.out.println(val + " no es un valor valido, intente de nuevo");
      }
      counter++;
    }

    return res;
  }

  public void setLeftLimit(Integer leftLimit) {
    this.leftLimit = leftLimit;
  }
}
