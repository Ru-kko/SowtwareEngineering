namespace App
{
  class Entry
  {
    static void Main()
    {
      Console.WriteLine(factorial(5));
      /* Console.WriteLine("Ingrese el primer numero"); */
      /* int a = Convert.ToInt32(Console.ReadLine()); */
      /* Console.WriteLine("Ingrese el segundo numero"); */
      /* int b = Convert.ToInt32(Console.ReadLine()); */
      /* Console.WriteLine($"La suma de {a} + {b} es: {a + b}"); */
    }

    static int factorial(int n)
    {
      if (n == 1)
      {
        return 1;
      }

      return n * factorial(n - 1);
    }
  }
}

/*
* Pedir dos numer y diferenciar menor y mayor
* Pedir el nombre de un dia de la semana X
* Pedir el precio de un producto, la forma de pago, y si es pago en targeta pedir el numero de cuenta
*/
