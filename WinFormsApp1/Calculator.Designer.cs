using System.Runtime.InteropServices;

namespace WinFormsApp1
{
    partial class Calculator
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
            KeyboardPanel = new TableLayoutPanel();
            Number0 = new Button();
            Point = new Button();
            Number7 = new Button();
            Number8 = new Button();
            Number9 = new Button();
            ActionAdd = new Button();
            Number4 = new Button();
            Number5 = new Button();
            Number6 = new Button();
            RestartAction = new Button();
            Number1 = new Button();
            Number2 = new Button();
            Number3 = new Button();
            MultiplyAction = new Button();
            DelAction = new Button();
            EqualsAction = new Button();
            LayoutPanel = new TableLayoutPanel();
            Panel = new TextBox();
            KeyboardPanel.SuspendLayout();
            LayoutPanel.SuspendLayout();
            SuspendLayout();
            // 
            // KeyboardPanel
            // 
            KeyboardPanel.BackColor = Color.Transparent;
            KeyboardPanel.ColumnCount = 4;
            KeyboardPanel.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            KeyboardPanel.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            KeyboardPanel.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            KeyboardPanel.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            KeyboardPanel.Controls.Add(Number0, 0, 3);
            KeyboardPanel.Controls.Add(Point, 0, 3);
            KeyboardPanel.Controls.Add(Number7, 0, 0);
            KeyboardPanel.Controls.Add(Number8, 1, 0);
            KeyboardPanel.Controls.Add(Number9, 2, 0);
            KeyboardPanel.Controls.Add(ActionAdd, 3, 0);
            KeyboardPanel.Controls.Add(Number4, 0, 1);
            KeyboardPanel.Controls.Add(Number5, 1, 1);
            KeyboardPanel.Controls.Add(Number6, 2, 1);
            KeyboardPanel.Controls.Add(RestartAction, 3, 1);
            KeyboardPanel.Controls.Add(Number1, 0, 2);
            KeyboardPanel.Controls.Add(Number2, 1, 2);
            KeyboardPanel.Controls.Add(Number3, 2, 2);
            KeyboardPanel.Controls.Add(MultiplyAction, 3, 2);
            KeyboardPanel.Controls.Add(DelAction, 1, 3);
            KeyboardPanel.Controls.Add(EqualsAction, 3, 3);
            KeyboardPanel.Dock = DockStyle.Fill;
            KeyboardPanel.Location = new Point(20, 92);
            KeyboardPanel.Margin = new Padding(0);
            KeyboardPanel.Name = "KeyboardPanel";
            KeyboardPanel.Padding = new Padding(2);
            KeyboardPanel.RowCount = 4;
            KeyboardPanel.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            KeyboardPanel.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            KeyboardPanel.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            KeyboardPanel.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            KeyboardPanel.Size = new Size(346, 371);
            KeyboardPanel.TabIndex = 0;
            // 
            // Number0
            // 
            Number0.BackColor = Color.DarkGray;
            Number0.BackgroundImageLayout = ImageLayout.None;
            Number0.Dock = DockStyle.Fill;
            Number0.FlatAppearance.BorderColor = Color.White;
            Number0.FlatAppearance.BorderSize = 0;
            Number0.FlatStyle = FlatStyle.Flat;
            Number0.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number0.ForeColor = SystemColors.Control;
            Number0.Location = new Point(89, 277);
            Number0.Margin = new Padding(2);
            Number0.Name = "Number0";
            Number0.Size = new Size(81, 90);
            Number0.TabIndex = 15;
            Number0.Text = "0";
            Number0.UseVisualStyleBackColor = false;
            Number0.Click += NumberClick;
            // 
            // Point
            // 
            Point.BackColor = Color.DarkGray;
            Point.BackgroundImageLayout = ImageLayout.None;
            Point.Dock = DockStyle.Fill;
            Point.FlatAppearance.BorderColor = Color.White;
            Point.FlatAppearance.BorderSize = 0;
            Point.FlatStyle = FlatStyle.Flat;
            Point.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Point.ForeColor = SystemColors.Control;
            Point.Location = new Point(4, 277);
            Point.Margin = new Padding(2);
            Point.Name = "Point";
            Point.Size = new Size(81, 90);
            Point.TabIndex = 14;
            Point.Text = ".";
            Point.UseVisualStyleBackColor = false;
            Point.Click += NumberClick;
            // 
            // Number7
            // 
            Number7.BackColor = Color.DarkGray;
            Number7.BackgroundImageLayout = ImageLayout.None;
            Number7.Dock = DockStyle.Fill;
            Number7.FlatAppearance.BorderColor = Color.White;
            Number7.FlatAppearance.BorderSize = 0;
            Number7.FlatStyle = FlatStyle.Flat;
            Number7.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number7.ForeColor = SystemColors.Control;
            Number7.Location = new Point(4, 4);
            Number7.Margin = new Padding(2);
            Number7.Name = "Number7";
            Number7.Size = new Size(81, 87);
            Number7.TabIndex = 0;
            Number7.Text = "7";
            Number7.UseVisualStyleBackColor = false;
            Number7.Click += NumberClick;
            // 
            // Number8
            // 
            Number8.BackColor = Color.DarkGray;
            Number8.BackgroundImageLayout = ImageLayout.None;
            Number8.Dock = DockStyle.Fill;
            Number8.FlatAppearance.BorderColor = Color.White;
            Number8.FlatAppearance.BorderSize = 0;
            Number8.FlatStyle = FlatStyle.Flat;
            Number8.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number8.ForeColor = SystemColors.Control;
            Number8.Location = new Point(89, 4);
            Number8.Margin = new Padding(2);
            Number8.Name = "Number8";
            Number8.Size = new Size(81, 87);
            Number8.TabIndex = 1;
            Number8.Text = "8";
            Number8.UseVisualStyleBackColor = false;
            Number8.Click += NumberClick;
            // 
            // Number9
            // 
            Number9.BackColor = Color.DarkGray;
            Number9.BackgroundImageLayout = ImageLayout.None;
            Number9.Dock = DockStyle.Fill;
            Number9.FlatAppearance.BorderColor = Color.White;
            Number9.FlatAppearance.BorderSize = 0;
            Number9.FlatStyle = FlatStyle.Flat;
            Number9.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number9.ForeColor = SystemColors.Control;
            Number9.Location = new Point(174, 4);
            Number9.Margin = new Padding(2);
            Number9.Name = "Number9";
            Number9.Size = new Size(81, 87);
            Number9.TabIndex = 2;
            Number9.Text = "9";
            Number9.UseVisualStyleBackColor = false;
            Number9.Click += NumberClick;
            // 
            // ActionAdd
            // 
            ActionAdd.BackColor = Color.DimGray;
            ActionAdd.BackgroundImageLayout = ImageLayout.None;
            ActionAdd.Dock = DockStyle.Fill;
            ActionAdd.FlatAppearance.BorderColor = Color.Black;
            ActionAdd.FlatAppearance.BorderSize = 0;
            ActionAdd.FlatAppearance.MouseOverBackColor = Color.DarkGray;
            ActionAdd.FlatStyle = FlatStyle.Flat;
            ActionAdd.Font = new Font("Segoe UI Black", 40F, FontStyle.Bold, GraphicsUnit.Point);
            ActionAdd.ForeColor = SystemColors.Control;
            ActionAdd.Location = new Point(259, 4);
            ActionAdd.Margin = new Padding(2);
            ActionAdd.Name = "ActionAdd";
            ActionAdd.Size = new Size(83, 87);
            ActionAdd.TabIndex = 3;
            ActionAdd.Text = "+";
            ActionAdd.TextAlign = ContentAlignment.TopRight;
            ActionAdd.UseVisualStyleBackColor = false;
            ActionAdd.Click += PerformOperation;
            // 
            // Number4
            // 
            Number4.BackColor = Color.DarkGray;
            Number4.BackgroundImageLayout = ImageLayout.None;
            Number4.Dock = DockStyle.Fill;
            Number4.FlatAppearance.BorderColor = Color.White;
            Number4.FlatAppearance.BorderSize = 0;
            Number4.FlatStyle = FlatStyle.Flat;
            Number4.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number4.ForeColor = SystemColors.Control;
            Number4.Location = new Point(4, 95);
            Number4.Margin = new Padding(2);
            Number4.Name = "Number4";
            Number4.Size = new Size(81, 87);
            Number4.TabIndex = 4;
            Number4.Text = "4";
            Number4.UseVisualStyleBackColor = false;
            Number4.Click += NumberClick;
            // 
            // Number5
            // 
            Number5.BackColor = Color.DarkGray;
            Number5.BackgroundImageLayout = ImageLayout.None;
            Number5.Dock = DockStyle.Fill;
            Number5.FlatAppearance.BorderColor = Color.White;
            Number5.FlatAppearance.BorderSize = 0;
            Number5.FlatStyle = FlatStyle.Flat;
            Number5.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number5.ForeColor = SystemColors.Control;
            Number5.Location = new Point(89, 95);
            Number5.Margin = new Padding(2);
            Number5.Name = "Number5";
            Number5.Size = new Size(81, 87);
            Number5.TabIndex = 5;
            Number5.Text = "5";
            Number5.UseVisualStyleBackColor = false;
            Number5.Click += NumberClick;
            // 
            // Number6
            // 
            Number6.BackColor = Color.DarkGray;
            Number6.BackgroundImageLayout = ImageLayout.None;
            Number6.Dock = DockStyle.Fill;
            Number6.FlatAppearance.BorderColor = Color.White;
            Number6.FlatAppearance.BorderSize = 0;
            Number6.FlatStyle = FlatStyle.Flat;
            Number6.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number6.ForeColor = SystemColors.Control;
            Number6.Location = new Point(174, 95);
            Number6.Margin = new Padding(2);
            Number6.Name = "Number6";
            Number6.Size = new Size(81, 87);
            Number6.TabIndex = 6;
            Number6.Text = "6";
            Number6.UseVisualStyleBackColor = false;
            Number6.Click += NumberClick;
            // 
            // RestartAction
            // 
            RestartAction.BackColor = Color.DimGray;
            RestartAction.BackgroundImageLayout = ImageLayout.None;
            RestartAction.Dock = DockStyle.Fill;
            RestartAction.FlatAppearance.BorderColor = Color.White;
            RestartAction.FlatAppearance.BorderSize = 0;
            RestartAction.FlatStyle = FlatStyle.Flat;
            RestartAction.Font = new Font("Segoe UI Black", 50F, FontStyle.Bold, GraphicsUnit.Point);
            RestartAction.ForeColor = SystemColors.Control;
            RestartAction.Location = new Point(259, 95);
            RestartAction.Margin = new Padding(2);
            RestartAction.Name = "RestartAction";
            RestartAction.Size = new Size(83, 87);
            RestartAction.TabIndex = 7;
            RestartAction.Text = "-";
            RestartAction.TextAlign = ContentAlignment.TopCenter;
            RestartAction.UseVisualStyleBackColor = false;
            RestartAction.Click += PerformOperation;
            // 
            // Number1
            // 
            Number1.BackColor = Color.DarkGray;
            Number1.BackgroundImageLayout = ImageLayout.None;
            Number1.Dock = DockStyle.Fill;
            Number1.FlatAppearance.BorderColor = Color.White;
            Number1.FlatAppearance.BorderSize = 0;
            Number1.FlatStyle = FlatStyle.Flat;
            Number1.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number1.ForeColor = SystemColors.Control;
            Number1.Location = new Point(4, 186);
            Number1.Margin = new Padding(2);
            Number1.Name = "Number1";
            Number1.Size = new Size(81, 87);
            Number1.TabIndex = 8;
            Number1.Text = "1";
            Number1.UseVisualStyleBackColor = false;
            Number1.Click += NumberClick;
            // 
            // Number2
            // 
            Number2.BackColor = Color.DarkGray;
            Number2.BackgroundImageLayout = ImageLayout.None;
            Number2.Dock = DockStyle.Fill;
            Number2.FlatAppearance.BorderColor = Color.White;
            Number2.FlatAppearance.BorderSize = 0;
            Number2.FlatStyle = FlatStyle.Flat;
            Number2.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number2.ForeColor = SystemColors.Control;
            Number2.Location = new Point(89, 186);
            Number2.Margin = new Padding(2);
            Number2.Name = "Number2";
            Number2.Size = new Size(81, 87);
            Number2.TabIndex = 9;
            Number2.Text = "2";
            Number2.UseVisualStyleBackColor = false;
            Number2.Click += NumberClick;
            // 
            // Number3
            // 
            Number3.BackColor = Color.DarkGray;
            Number3.BackgroundImageLayout = ImageLayout.None;
            Number3.Dock = DockStyle.Fill;
            Number3.FlatAppearance.BorderColor = Color.White;
            Number3.FlatAppearance.BorderSize = 0;
            Number3.FlatStyle = FlatStyle.Flat;
            Number3.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            Number3.ForeColor = SystemColors.Control;
            Number3.Location = new Point(174, 186);
            Number3.Margin = new Padding(2);
            Number3.Name = "Number3";
            Number3.Size = new Size(81, 87);
            Number3.TabIndex = 10;
            Number3.Text = "3";
            Number3.UseVisualStyleBackColor = false;
            Number3.Click += NumberClick;
            // 
            // MultiplyAction
            // 
            MultiplyAction.BackColor = Color.DimGray;
            MultiplyAction.BackgroundImageLayout = ImageLayout.None;
            MultiplyAction.Dock = DockStyle.Fill;
            MultiplyAction.FlatAppearance.BorderColor = Color.White;
            MultiplyAction.FlatAppearance.BorderSize = 0;
            MultiplyAction.FlatStyle = FlatStyle.Flat;
            MultiplyAction.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            MultiplyAction.ForeColor = SystemColors.Control;
            MultiplyAction.Location = new Point(259, 186);
            MultiplyAction.Margin = new Padding(2);
            MultiplyAction.Name = "MultiplyAction";
            MultiplyAction.Size = new Size(83, 87);
            MultiplyAction.TabIndex = 11;
            MultiplyAction.Text = "X";
            MultiplyAction.UseVisualStyleBackColor = false;
            MultiplyAction.Click += PerformOperation;
            // 
            // DelAction
            // 
            DelAction.BackColor = Color.IndianRed;
            DelAction.BackgroundImageLayout = ImageLayout.None;
            DelAction.Dock = DockStyle.Fill;
            DelAction.FlatAppearance.BorderColor = Color.White;
            DelAction.FlatAppearance.BorderSize = 0;
            DelAction.FlatStyle = FlatStyle.Flat;
            DelAction.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            DelAction.ForeColor = SystemColors.Control;
            DelAction.Location = new Point(174, 277);
            DelAction.Margin = new Padding(2);
            DelAction.Name = "DelAction";
            DelAction.Size = new Size(81, 90);
            DelAction.TabIndex = 12;
            DelAction.Text = "CE";
            DelAction.UseVisualStyleBackColor = false;
            DelAction.Click += PerformOperation;
            // 
            // EqualsAction
            // 
            EqualsAction.BackColor = Color.Silver;
            EqualsAction.BackgroundImageLayout = ImageLayout.None;
            EqualsAction.Dock = DockStyle.Fill;
            EqualsAction.FlatAppearance.BorderColor = Color.White;
            EqualsAction.FlatAppearance.BorderSize = 0;
            EqualsAction.FlatStyle = FlatStyle.Flat;
            EqualsAction.Font = new Font("Segoe UI Black", 27.75F, FontStyle.Bold, GraphicsUnit.Point);
            EqualsAction.ForeColor = SystemColors.Control;
            EqualsAction.Location = new Point(259, 277);
            EqualsAction.Margin = new Padding(2);
            EqualsAction.Name = "EqualsAction";
            EqualsAction.Size = new Size(83, 90);
            EqualsAction.TabIndex = 13;
            EqualsAction.Text = "=";
            EqualsAction.UseVisualStyleBackColor = false;
            EqualsAction.Click += PerformOperation;
            // 
            // LayoutPanel
            // 
            LayoutPanel.AutoSizeMode = AutoSizeMode.GrowAndShrink;
            LayoutPanel.ColumnCount = 3;
            LayoutPanel.ColumnStyles.Add(new ColumnStyle(SizeType.Absolute, 20F));
            LayoutPanel.ColumnStyles.Add(new ColumnStyle());
            LayoutPanel.ColumnStyles.Add(new ColumnStyle(SizeType.Absolute, 20F));
            LayoutPanel.Controls.Add(KeyboardPanel, 1, 1);
            LayoutPanel.Controls.Add(Panel, 1, 0);
            LayoutPanel.Dock = DockStyle.Fill;
            LayoutPanel.Location = new Point(0, 0);
            LayoutPanel.Name = "LayoutPanel";
            LayoutPanel.RowCount = 2;
            LayoutPanel.RowStyles.Add(new RowStyle(SizeType.Percent, 20F));
            LayoutPanel.RowStyles.Add(new RowStyle(SizeType.Percent, 80F));
            LayoutPanel.Size = new Size(388, 463);
            LayoutPanel.TabIndex = 2;
            LayoutPanel.Paint += LayoutPanel_Paint;
            // 
            // Panel
            // 
            Panel.BackColor = Color.Black;
            Panel.BorderStyle = BorderStyle.None;
            Panel.Cursor = Cursors.IBeam;
            Panel.Dock = DockStyle.Bottom;
            Panel.Font = new Font("Arial", 24F, FontStyle.Bold, GraphicsUnit.Point);
            Panel.ForeColor = Color.WhiteSmoke;
            Panel.Location = new Point(20, 25);
            Panel.Margin = new Padding(0, 0, 0, 30);
            Panel.Name = "Panel";
            Panel.RightToLeft = RightToLeft.No;
            Panel.Size = new Size(346, 37);
            Panel.TabIndex = 1;
            Panel.TextAlign = HorizontalAlignment.Right;
            Panel.TextChanged += UpdateValue;
            // 
            // Calculator
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = SystemColors.Desktop;
            ClientSize = new Size(388, 463);
            Controls.Add(LayoutPanel);
            ForeColor = SystemColors.ControlLightLight;
            Name = "Calculator";
            Text = "Calculator";
            KeyboardPanel.ResumeLayout(false);
            LayoutPanel.ResumeLayout(false);
            LayoutPanel.PerformLayout();
            ResumeLayout(false);
        }

        #endregion

        private TableLayoutPanel KeyboardPanel;
        private Button Number7;
        private Button Number8;
        private Button Number9;
        private Button ActionAdd;
        private Button Number4;
        private Button Number5;
        private Button Number6;
        private Button RestartAction;
        private Button Number1;
        private Button Number2;
        private Button Number3;
        private Button MultiplyAction;
        private Button DelAction;
        private Button EqualsAction;
        private TableLayoutPanel LayoutPanel;
        private TextBox Panel;
        private Button Point;
        private Button Number0;
    }
}