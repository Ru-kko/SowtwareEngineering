using ejercicio_01;

namespace Ejrecicio_01 {
    internal class App
    {
        static void Main(string[] args)
        {
            // 01
            Factorial factorail = new Factorial(5);
            int factorialResp = factorail.getResult();

            Console.WriteLine($"El resultado de 5! es {factorialResp}");

            // 02
            Fibonacci fibonacci = new Fibonacci(5);
            int fibResp = fibonacci.getResult();

            Console.WriteLine($"El numero 5 de la secuencioa fibonacci es {fibResp}");

            // 03
            SumaNatural suma = new SumaNatural(5);
            int sumResp = suma.getResult();

            Console.WriteLine($"La suma de los primeros 5 numeros naturales es {sumResp}");
        }
    }
}