namespace WinFormsApp1
{
    public partial class Calculator : Form
    {
        private Nullable<Decimal> stored;
        private Decimal actual = 0;
        private bool chagedFromCode = false;
        private Nullable<AricmeticOperation> lastOperation;

        private enum AricmeticOperation
        {
            Add,
            Subtract,
            Multiply
        }

        public Calculator()
        {
            InitializeComponent();
        }


        private void NumberClick(object sender, EventArgs e)
        {
            if (sender is Button btn)
            {
                this.Panel.Text += btn.Text;
            }
        }

        private void PerformOperation(object sender, EventArgs e)
        {
            if (sender is Button btn)
            {
                this.chagedFromCode = true;
                switch (btn.Text)
                {
                    case "=":
                        checkChanges();
                        this.chagedFromCode = false;
                        this.Panel.Text = this.stored.ToString();
                        this.actual = this.stored ?? 0;
                        this.stored = null;
                        break;
                    case "+":
                        this.lastOperation = AricmeticOperation.Add;
                        this.stored = this.stored != null ? this.stored + this.actual : this.actual;
                        this.actual = 0;
                        this.Panel.Text = "";
                        break;
                    case "-":
                        this.lastOperation = AricmeticOperation.Subtract;
                        this.stored = this.stored != null ? this.stored - this.actual : this.actual;
                        this.actual = 0;
                        this.Panel.Text = "";
                        break;
                    case "X":
                        this.lastOperation = AricmeticOperation.Multiply;
                        this.stored = stored != null ? this.stored * actual : this.actual;
                        this.actual = 0;
                        this.Panel.Text = "";
                        break;
                    case "CE":
                        this.lastOperation = null;
                        this.actual = 0;
                        this.stored = null;
                        this.Panel.Text = "";
                        break;
                }

            }
        }
        private void checkChanges()
        {
            if (this.lastOperation != null)
            {
                switch (this.lastOperation)
                {
                    case AricmeticOperation.Add:
                        this.stored += this.actual;
                        break;
                    case AricmeticOperation.Subtract:
                        this.stored -= this.actual;
                        break;
                    case AricmeticOperation.Multiply:
                        this.stored *= this.actual;
                        break;
                }
                this.lastOperation = null;
            }
        }

        private void UpdateValue(object sender, EventArgs e)
        {
            if (sender is TextBox box && !chagedFromCode)
            {
                try
                {
                    if (box.Text == "0" || box.Text == "")
                    {
                        this.actual = 0;
                        this.chagedFromCode = true;
                        box.Text = "";
                        return;
                    }

                    var num = Convert.ToDecimal(box.Text);
                    this.actual = num;
                }
                catch (FormatException)
                {
                    var txt = this.actual.ToString();
                    this.chagedFromCode = true;
                    box.Text = txt;
                    box.Select(txt.Length, txt.Length);
                }
            }
            chagedFromCode = false;
        }

        private void LayoutPanel_Paint(object sender, PaintEventArgs e)
        {

        }
    }
}