namespace Program;

class App
{
  public static void Main() {
    Console.WriteLine("Escribe un numero para calcular: x!/x");
    var num = Convert.ToInt32(Console.ReadLine());

    try {
      var res = 0;
      // no se puede calcular el factorial de un negativo
      if (num < 0) {
        throw new ArithmeticException("No se puede calcular el factorial de un negativo");
      }

      for (var i = 1; i <= num; i++) {
        res *= i;
      }

      // ArithmeticException es clase padre de DivideByZeroException
      res /= num;

      Console.WriteLine(num + "!/" + num + " es igual a: " + res);
    }
    catch (ArithmeticException err) {
      Console.WriteLine("Error: " + err.Message);
    }
  }
}
