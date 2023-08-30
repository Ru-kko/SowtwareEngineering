namespace ejercicio_01
{
    internal class Fibonacci
    {
        private int number;
        public Fibonacci(int number)
        {
            this.number = number;
        }

        private int calcule(int n)
        {
            if (n == 0) 
            { 
                return 0;
            }
            if (n == 1) 
            { 
                return 1;
            }

            return calcule(n - 1) + calcule(n - 2);
        }

        public int getResult()
        {
            return calcule(number);
        }
    }
}
