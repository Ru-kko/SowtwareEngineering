namespace Program;

class Examples
{
    public static void example()
    {
        try
        {
            var zero = 0;
            int res = 10 / zero;
        }
        catch (DivideByZeroException err)
        {
            Console.WriteLine("Error: División por cero no permitida");
            Console.WriteLine("Mensaje de la exepcion. " + err.Message);
        }

        Console.WriteLine();

        try
        {
            int[] arr = new int[] { 10, 9, 8, 7, 6, 5, 3, 2, 1 };
            arr[11] = 10;
        }
        catch (IndexOutOfRangeException err)
        {
            Console.WriteLine("Error: Indice fuera de rango");
            Console.WriteLine("Mensaje de la exepcion. " + err.Message);
        }
    }
}
