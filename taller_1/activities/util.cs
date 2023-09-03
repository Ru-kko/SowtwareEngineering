namespace Activities
{
  class Util
  {
    public static int getNumber(string message = "\nIngrese un numero: ")
    {
      Console.Write(message);
      try
      {
        int res = Convert.ToInt32(Console.ReadLine());

        return res;
      }
      catch (FormatException)
      {
        Console.WriteLine("Eso no es un numero, intenta de nuevo");
        return getNumber(message);
      }
    }

    public static decimal getDecimal(string message = "\nIngrese un numero: ")
    {
      Console.Write(message);
      try
      {
        decimal res = Convert.ToDecimal(Console.ReadLine());

        return res;
      }
      catch (FormatException)
      {
        Console.WriteLine("Eso no es un numero, intenta de nuevo");
        return getNumber(message);
      }
    }
  }
}
