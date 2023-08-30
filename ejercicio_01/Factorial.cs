namespace ejercicio_01
{
    internal class Factorial
    {
        private int number;
        public Factorial(int number)
        {
            this.number = number;
        }

        private int calcule(int n)
        {
            if (n == 0)
                return 1;
            return n * calcule(n - 1);
        }

        public int getResult()
        {
            return calcule(number);
        }
    }
}
