using Actividad1;

namespace Activities
{
  class Exercise05 : IActivity
  {
    private const string Sentence =
        "En Ucompensar existen 5 programas cada"
        + " uno con n estudiantes, cada uno de los estudiantes paga"
        + " un valor n de matrícula, hallar el promedio de la matrícula"
        + " por programa y el mayor valor de la matricula pagada por los"
        + " estudiantes, imprimir el valor y el programa al cual pertenece";

    void IActivity.execute()
    {
      var programs = new Program[5];
      decimal maxPrice = 0;
      int programIndex = 0;

      for (int i = 0; i < programs.Length; i++)
      {
        string name = string.Format("P{0}", i + 1);
        int students = Util.getNumber(
            "\nIngrese el numero de estudiantes en el programa " + name + ": "
        );

        var program = new Program(students, name);
        program.fillPrices();

        if (program.getMaxValue() > maxPrice)
        {
          maxPrice = program.getMaxValue();
          programIndex = i;
        }

        programs[i] = program;
      }

      foreach (var i in programs)
      {
        Console.WriteLine(
            "El valor promedio de la matricula del programa {0}, es: {1}",
            i.name,
            i.getAverage()
        );
      }
      Console.WriteLine(
          "El estudiante con mayor valor de matricula fue {0}, en el programa {1}",
          maxPrice,
          programs[programIndex].name
      );
    }

    string IActivity.getSentence()
    {
      return Sentence;
    }
  }

  internal class Program
  {
    public string name { get; }
    private int students;
    private decimal[] prices;
    private decimal maxValue = 0;
    private decimal average = 0;

    public Program(int students, string name)
    {
      this.students = students;
      prices = new decimal[this.students];
      this.name = name;
    }

    public void fillPrices()
    {
      decimal sum = 0;
      for (int i = 0; i < prices.Length; i++)
      {
        decimal price = Util.getDecimal(
            string.Format(
                "\nIngrese el precio de la matricula del estudiante N°{0} en el programa {1}: ",
                i + 1,
                name
            )
        );
        prices[i] = price;
        sum += price;

        if (price > maxValue)
        {
          maxValue = price;
        }
      }
      average = sum / students;
    }

    public decimal getMaxValue()
    {
      return maxValue;
    }

    public decimal getAverage()
    {
      return average;
    }
  }
}
