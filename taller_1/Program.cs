using Activities;

namespace Actividad1
{
  class App
  {
    private IActivity[] activities;

    public App()
    {
      this.activities = new IActivity[]
      {
                new Exercise01(),
                new Exercise02(),
                new Exercise03(),
                new Exercise04(),
                new Exercise05()
      };
    }

    static void Main()
    {
      new App().gameLoop();
    }

    public void gameLoop()
    {
      Console.Clear();
      Console.WriteLine("Opciones: ");
      Console.WriteLine("(1) salir");
      Console.WriteLine("(2) Ejercicios");
      int opt = Util.getNumber("Inserte una opcion: ");

      if (opt == 2)
      {
        runExercice();
        gameLoop();
        return;
      }

      Console.WriteLine("Adios");
    }

    public void runExercice(bool prev = false)
    {
      Console.Clear();
      if (prev)
      {
        Console.WriteLine("No existe ningun ejercicio asociado, intentelo de nuevo");
      }

      for (int i = 0; i < this.activities.Length; i++)
      {
        Console.WriteLine("{0} - {1}", i + 1, activities[i].getSentence());
      }
      int ex = Util.getNumber("\nEscriva el numero asociado al ejercicio: ");

      if (ex > 5 || ex < 1)
      {
        runExercice(true);
        return;
      }
      Console.Clear();
      activities[ex - 1].execute();
      Console.WriteLine("Presione una tecla para continuar");
      Console.ReadKey();
    }
  }

  interface IActivity
  {
    public void execute();
    public string getSentence();
  }
}
