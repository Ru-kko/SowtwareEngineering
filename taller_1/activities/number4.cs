using Actividad1;

namespace Activities
{
  class Exercise04 : IActivity
  {
    private const string Sentence =
        "Pedir 5 números y escribir la suma total, únicamente debe aceptar números pares.";

    private int getNumber(int index)
    {
      int res = Util.getNumber(string.Format("Ingrese el numero {0}, debe ser par: ", index));

      if (res % 2 != 0)
      {
        Console.WriteLine("Ese no es un numero par, intenta de nuevo");
        return getNumber(index);
      }

      return res;
    }

    void IActivity.execute()
    {
      int sum = 0;

      for (int i = 1; i <= 5; i++)
      {
        int num = getNumber(i);
        sum += num;
      }

      Console.WriteLine("La suma total es: " + sum);
    }

    string IActivity.getSentence()
    {
      return Sentence;
    }
  }
}
