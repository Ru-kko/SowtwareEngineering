package app.cli;

import java.text.ParseException;

public interface Parser<T> {
  public String getFormat();
  public T parse(String msg) throws NumberFormatException, ParseException;
}
