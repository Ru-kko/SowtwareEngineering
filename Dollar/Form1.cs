using System.Globalization;

namespace Dollar
{
    public partial class Form1 : Form
    {
        private NumberFormatInfo setPrecision;
        private const Decimal DollarPrice = 4213.55M;
        private Decimal actualPesos = 0.00M;
        private Decimal actualDolar = 0.00M;
        private bool changedByCode = false;
        public Form1()
        {
            this.setPrecision = new NumberFormatInfo();
            this.setPrecision.NumberDecimalDigits = 2;
            InitializeComponent();

            Reset();
        }

        void CalculeFrom(UpdateFrom from)
        {
            changedByCode = true;
            try
            {
                switch (from)
                {
                    case UpdateFrom.Dollar:
                        actualPesos = DollarPrice * actualDolar;
                        this.CopInput.Text = actualPesos.ToString("N", setPrecision);
                        break;
                    case UpdateFrom.Pesos:
                        actualDolar = actualPesos / DollarPrice;
                        this.DollarInput.Text = actualDolar.ToString("N", setPrecision);
                        break;
                }
            }
            catch (DivideByZeroException)
            {
                actualDolar = 0.00M;
                this.DollarInput.Text = actualDolar.ToString("N", setPrecision);
            }
        }

        private void UpdateCopInput(object sender, EventArgs e)
        {
            if (changedByCode)
            {
                changedByCode = false;
                return;
            }
            if (sender is TextBox box)
            {
                if (box.Text.Length <= 0)
                {
                    actualPesos = 0.00M;
                    return;
                }
                try
                {
                    var newVal = Convert.ToDecimal(box.Text);
                    this.actualPesos = newVal;
                    CalculeFrom(UpdateFrom.Pesos);
                }
                catch (FormatException)
                {
                    changedByCode = true;
                    box.Text = this.actualPesos.ToString("N", setPrecision);
                    box.Select(box.Text.Length, 0);
                }
            }
        }

        private void UpdateDollarInput(object sender, EventArgs e)
        {
            if (changedByCode)
            {
                changedByCode = false;
                return;
            }
            if (sender is TextBox box)
            {
                if (box.Text.Length <= 0)
                {
                    actualDolar = 0.00M;
                    return;
                }
                try
                {
                    var newVal = Convert.ToDecimal(box.Text);
                    this.actualDolar = newVal;
                    CalculeFrom(UpdateFrom.Dollar);
                }
                catch (FormatException)
                {
                    changedByCode = true;
                    box.Text = this.actualDolar.ToString("N", setPrecision);
                    box.Select(box.Text.Length, 0);
                }
            }
        }

        private void RessetBtn_Click(object sender, EventArgs e)
        {
            // No se que mas poner \(._.`)/
            Reset();
        }

        private void Reset()
        {
            this.actualDolar = 0.00M;
            this.actualPesos = 0.00M;

            this.changedByCode = true;
            this.CopInput.Text = "0.00";

            this.changedByCode = true;
            this.DollarInput.Text = "0.00";
        }
    }

    enum UpdateFrom
    {
        Dollar,
        Pesos
    }
}