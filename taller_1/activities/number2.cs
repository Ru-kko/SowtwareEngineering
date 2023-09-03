using Actividad1;

namespace Activities
{
  class Exercise02 : IActivity
  {
    private const string Senctence =
        "Diseñar y codificar un programa en C#, que"
        + " adivine un número aleatorio entre 0 100 con"
        + " un máximo de 10 intentos por parte del usuario,"
        + " indicando si es mayor o menor. Imprimir el"
        + " número de intentos y terminarlo cuando se"
        + " encuentre el número o llegue a su máximo(10 intentos)."
        + " Con esta función se genera un número aleatorio entre 0"
        + " y 100, la interfaz debe cambiar de color cuando supere el"
        + " 50% de los intentos";

    private const ConsoleColor GREEN = ConsoleColor.Green;
    private const ConsoleColor RED = ConsoleColor.Red;

    private int getNumber()
    {
      int res = Util.getNumber("\nEscribe un numero entre 0 y 100: ");
      if (res > 100 || res < 0)
      {
        Console.WriteLine("Ese numero no esta en el rango, intenta de nuevo");
        return getNumber();
      }
      return res;
    }

    void IActivity.execute()
    {
      int attemp = 0,
          maxAttemps = 10;

      int randomNumber = new Random().Next(0, 101);
      var found = false;

      Console.ForegroundColor = GREEN;
      while (attemp < maxAttemps)
      {
        if (attemp > (maxAttemps * 0.5))
        {
          Console.ForegroundColor = RED;
        }

        Console.WriteLine("Intento No° {0}", attemp + 1);
        int number = getNumber();

        if (number < randomNumber)
        {
          Console.WriteLine("El numero es mayor");
        }
        else if (number > randomNumber)
        {
          Console.WriteLine("El numero es menor");
        }
        else if (number == randomNumber)
        {
          Console.ForegroundColor = GREEN;
          Console.WriteLine("Felicidades encontraste el numero");
          found = true;
          break;
        }

        attemp++;
      }
      if (!found)
      {
        Console.WriteLine("Lo siento no lo encontraste, el numero era {0}", randomNumber);
      }
      Console.ResetColor();
    }

    string IActivity.getSentence()
    {
      return Senctence;
    }
  }
}
