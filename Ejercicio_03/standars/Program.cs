namespace Application
{
  class App
  {
    static void Main()
    {
      string apellidos;
      string nombres;
      int edad;
      double estatura;
      bool estudiante;
      double salario;
      int identificacion;

      Console.WriteLine("Digite el numero de identificacion");
      identificacion = int.Parse(Console.ReadLine());
      Console.WriteLine("Digite los apellidos");
      apellidos = Console.ReadLine();
      Console.WriteLine("Digite los nombres");
      nombres = Console.ReadLine(); 
      Console.WriteLine("Digite la edad");
      edad = int.Parse(Console.ReadLine());
      Console.WriteLine("Digite su estatura");
      estatura = double.Parse(Console.ReadLine());
      Console.WriteLine("Digite el salario");
      salario = double.Parse(Console.ReadLine());
      Console.WriteLine("Es estudiante? (true o false) ");
      if (!bool.TryParse(Console.ReadLine(),out estudiante)) 
      {
        Console.WriteLine("Valor no valido, se asumira como false");
        estudiante = false;
      }

      Console.WriteLine($"Identificacion: {identificacion}");
      Console.WriteLine($"Apellidos: {apellidos}");
      Console.WriteLine($"Nombres: {nombres}");
      Console.WriteLine($"Edad: {edad}");
      Console.WriteLine($"Estatura: {estatura}");
      Console.WriteLine($"Salario: {salario}");
      Console.WriteLine(estudiante ? "Es estudiante" : "No es estudiante");

      Console.ReadKey();
    }
     /*
      * Ingresar dos numeros y realizar la suma
      * */

    static bool readBoolLine()
    {
      string line = Console.ReadLine().ToLower();

      if (line == "true" || line == "1" || line == "verdadero" || line == "si")
      {
        return true;
      }
      if (line == "false" || line == "0" || line == "false" || line == "no")
      {
        return false;
      }

      throw new FormatException();
    }
  }
}
