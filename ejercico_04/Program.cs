namespace App;

class Application
{
  static string getString() {
    var txt = Console.ReadLine();
    try
    {
      Convert.ToDecimal(txt);
    }
    catch (FormatException)
    {
      return txt != null ? txt : "";
    }
    return "texto no valido";
  }

  static int getInteger()
  {
    var txt = Console.ReadLine();
    try
    {
      return Convert.ToInt32(txt);
    }
    catch (FormatException)
    {
      Console.WriteLine(txt + " no es un numero valido, intente de nuevo: ");
      return getInteger();
    }
  }

  public static void Main()
  {
    Console.WriteLine("Ingrese un numero entero: ");
    Console.WriteLine("Se ecribio el el numero: " + Application.getInteger());
  }
}
