using Actividad2;

namespace Activities;

class Activity03 : IActivity
{
  private const string Sentence =
      "Realice un código solicite el precio de un"
      + " producto, forma de pago tarjeta o efectivo,"
      + " si es tarjeta pedir numero de cuenta.";

  public int getOption() {
    var res = Util.getNumber("\n Ingrese una opcion: ");

    if (res != 1 && res != 2) {
      Console.WriteLine("Opcion no valida, intente de nuevo");
      return getOption();
    }

    return res;
  }
  void IActivity.execute()
  {
    var price = Util.getDecimal("\nIngrese el precio del producto: ");
    Console.WriteLine("Pagar con \n 1 - Targeta \n 2 - Efectivo"); 
    int option = getOption();

    if (option == 1) 
    {
      var number = Util.getNumber("Ingrese el numero de cuenta: ");
      Console.WriteLine($"Pago un total de {price}, con la tageta con numero de cuenta {number}");

      return;
    }

    Console.WriteLine($"Pago un total de {price} en efectivo");
  }

  string IActivity.getSentence()
  {
    return Sentence;
  }
}
