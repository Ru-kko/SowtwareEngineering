using Actividad1;

namespace Activities
{
  class Exercise03 : IActivity
  {
    private const string Sentence =
        "Diseñar y codificar un programa en C#,"
        + " que imprima los números múltiplos de 5 de 0 a n"
        + " utilizando un bucle while, hallar la sumatoria"
        + " y el promedio.";

    void IActivity.execute()
    {
      int number = Util.getNumber("Ingrese el numero de multiplos de 5 a imprimir: ");
      int average,
          sum = 0,
          index = 0;
      int[] mult = new int[number];

      while (index < mult.Length)
      {
        int value = index * 5;
        mult[index] = value;
        sum += value;
        index++;
      }
      average = sum / number;

      Console.WriteLine("Promedio: {0}", average);
      Console.WriteLine("Sumatoria: {0}", sum);
      Console.WriteLine(
          "Los {0} primeros multiplos de 5: {1}",
          number,
          string.Join<int>(" , ", mult)
      );
    }

    string IActivity.getSentence()
    {
      return Sentence;
    }
  }
}
