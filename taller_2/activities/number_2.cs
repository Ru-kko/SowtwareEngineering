using Actividad2;

namespace Activities;

class Activity02 : IActivity
{
  private const string Sentence =
      "Realice un código donde solicite día de"
      + " la semana e indicar si es fin de semana o "
      + " no y mostrar el error en caso de no ser fin de semana";
  private HashSet<string> weekdays;
  private HashSet<string> weekends;

  public Activity02()
  {
    this.weekdays = new string[]
    {
            "lunes",
            "martes",
            "miercoles",
            "jueves",
            "viernes",
    }.ToHashSet();
    this.weekends = new string[] { "domingo", "sabado" }.ToHashSet();
  }

  void IActivity.execute()
  {
    Console.WriteLine("Ingrese el nombre del dia de la semana");
    var weekday = Console.ReadLine();

    if (weekday == null)
    {
      return;
    }
    
    if (weekdays.Contains(weekday.ToLower()))
    {
      Console.WriteLine("Es entre semana");
      return;
    }
    if (weekends.Contains(weekday.ToLower()))
    {
      Console.WriteLine("es fin de semana");
      return;
    }

    Console.WriteLine(weekday + " no es un dia valido");
  }

  string IActivity.getSentence()
  {
    return Sentence;
  }
}
