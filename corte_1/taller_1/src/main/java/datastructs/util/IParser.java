package datastructs.util;

import java.text.ParseException;

public interface IParser<T> {
  public T parse(String str) throws ParseException, NumberFormatException; 
}
