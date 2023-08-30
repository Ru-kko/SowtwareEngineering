namespace ejercicio_01
{
    internal class SumaNatural
    {
        private int number;
        public SumaNatural(int number)
        {
            this.number = number;
        }

        private int calcule(int n)
        {
            if (n == 1)
            {
                return 1;
            }

            return n + calcule(n - 1);
        }

        public int getResult()
        {
            return calcule(number);
        }
    }
}
