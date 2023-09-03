using Actividad1;

namespace Activities
{
  class Exercise01 : IActivity
  {
    private const string Sentence =
        "Diseñar y codificar un programa en C#, que obtenga "
        + "los números enteros pares comprendidos entre dos "
        + "números introducidos por teclado y validados como distintos, "
        + "el programa debe iniciar por el menor de los enteros introducidos";

    public int[] getNumbers(int a, int b)
    {
      int[] res = new int[Math.Abs(b - a) + 1];
      int start = b;

      if (a < b)
      {
        start = a;
      }
      for (int i = 0; i < res.Length; i++)
      {
        res[i] = start;
        start++;
      }

      return res;
    }

    void IActivity.execute()
    {
      int a = Util.getNumber("Ingrese el primer numero: ");
      int b = Util.getNumber("Ingrese el segundo numero: ");

      Console.WriteLine(
          "La respuesta es [{0}]",
          string.Join<int>(" , ", this.getNumbers(a, b))
      );
    }

    string IActivity.getSentence()
    {
      return Sentence;
    }
  }
}
