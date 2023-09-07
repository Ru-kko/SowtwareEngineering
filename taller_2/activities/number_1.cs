using Actividad2;

namespace Activities;

class Activity01 : IActivity
{
  private const string Sentence =
      "Realice un código donde el usuario digite dos"
      + " números e indicar cual es el mayor y el menor.";

  void IActivity.execute()
  {
    int a = Util.getNumber("\n Ingrese el primer numero: ");
    int b = Util.getNumber("\n Ingrese el segundo numero: ");
    
    bool res = a > b;

    Console.WriteLine(string.Format("{0} es mayor o igual a {1}", res ? a : b, res ? b : a));
  }

  string IActivity.getSentence()
  {
    return Sentence;
  }
}
