namespace Dollar
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            Layout = new TableLayoutPanel();
            DollarMsg = new Label();
            DollarInput = new TextBox();
            CopInput = new TextBox();
            PesosMsg = new Label();
            RessetBtn = new Button();
            Layout.SuspendLayout();
            SuspendLayout();
            // 
            // Layout
            // 
            Layout.ColumnCount = 2;
            Layout.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            Layout.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 50F));
            Layout.ColumnStyles.Add(new ColumnStyle(SizeType.Absolute, 20F));
            Layout.Controls.Add(DollarMsg, 1, 1);
            Layout.Controls.Add(DollarInput, 1, 0);
            Layout.Controls.Add(CopInput, 0, 0);
            Layout.Controls.Add(PesosMsg, 0, 1);
            Layout.Controls.Add(RessetBtn, 0, 2);
            Layout.Dock = DockStyle.Fill;
            Layout.Location = new Point(0, 0);
            Layout.Name = "Layout";
            Layout.RowCount = 3;
            Layout.RowStyles.Add(new RowStyle(SizeType.Percent, 21.11111F));
            Layout.RowStyles.Add(new RowStyle(SizeType.Percent, 78.8888855F));
            Layout.RowStyles.Add(new RowStyle(SizeType.Absolute, 40F));
            Layout.Size = new Size(800, 450);
            Layout.TabIndex = 0;
            // 
            // DollarMsg
            // 
            DollarMsg.Font = new Font("Segoe UI", 36F, FontStyle.Bold, GraphicsUnit.Point);
            DollarMsg.Location = new Point(435, 121);
            DollarMsg.Margin = new Padding(35);
            DollarMsg.Name = "DollarMsg";
            DollarMsg.Size = new Size(316, 172);
            DollarMsg.TabIndex = 3;
            DollarMsg.Text = "Precio en Dollares";
            DollarMsg.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // DollarInput
            // 
            DollarInput.BackColor = Color.DarkGray;
            DollarInput.BorderStyle = BorderStyle.None;
            DollarInput.Dock = DockStyle.Fill;
            DollarInput.Font = new Font("Segoe UI", 14.25F, FontStyle.Regular, GraphicsUnit.Point);
            DollarInput.Location = new Point(450, 50);
            DollarInput.Margin = new Padding(50);
            DollarInput.Name = "DollarInput";
            DollarInput.Size = new Size(300, 26);
            DollarInput.TabIndex = 1;
            DollarInput.TextChanged += UpdateDollarInput;
            // 
            // CopInput
            // 
            CopInput.BackColor = Color.DarkGray;
            CopInput.BorderStyle = BorderStyle.None;
            CopInput.Dock = DockStyle.Fill;
            CopInput.Font = new Font("Segoe UI", 14.25F, FontStyle.Regular, GraphicsUnit.Point);
            CopInput.Location = new Point(50, 50);
            CopInput.Margin = new Padding(50);
            CopInput.Name = "CopInput";
            CopInput.Size = new Size(300, 26);
            CopInput.TabIndex = 0;
            CopInput.TextChanged += UpdateCopInput;
            // 
            // PesosMsg
            // 
            PesosMsg.Font = new Font("Segoe UI", 36F, FontStyle.Bold, GraphicsUnit.Point);
            PesosMsg.Location = new Point(35, 121);
            PesosMsg.Margin = new Padding(35);
            PesosMsg.Name = "PesosMsg";
            PesosMsg.Size = new Size(316, 172);
            PesosMsg.TabIndex = 2;
            PesosMsg.Text = "Precio en Pesos";
            PesosMsg.TextAlign = ContentAlignment.MiddleCenter;
            // 
            // RessetBtn
            // 
            RessetBtn.Anchor = AnchorStyles.Bottom;
            Layout.SetColumnSpan(RessetBtn, 2);
            RessetBtn.Location = new Point(250, 419);
            RessetBtn.Margin = new Padding(10);
            RessetBtn.MaximumSize = new Size(300, 50);
            RessetBtn.Name = "RessetBtn";
            RessetBtn.Size = new Size(300, 21);
            RessetBtn.TabIndex = 4;
            RessetBtn.Text = "Reset";
            RessetBtn.UseVisualStyleBackColor = true;
            RessetBtn.Click += RessetBtn_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(Layout);
            Name = "Form1";
            Text = "Form1";
            Layout.ResumeLayout(false);
            Layout.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private TableLayoutPanel Layout;
        private TextBox CopInput;
        private Label DollarMsg;
        private TextBox DollarInput;
        private Label PesosMsg;
        private Button RessetBtn;
    }
}