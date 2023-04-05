package paramsargs;

import javax.swing.JOptionPane;

public class App {
  public static void main(String[] args) throws Exception {
    Integer num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero", 0));
    Integer num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero", 0));

    Operation operacion = new Operation();
    
    JOptionPane.showMessageDialog(null, "La suma es: " + operacion.sumar(num1, num2));
    JOptionPane.showMessageDialog(null, "La resta es: " + operacion.restar(num1, num2));
    JOptionPane.showMessageDialog(null, "La multiplicacion es: " + operacion.multiplicar(num1, num2));
    JOptionPane.showMessageDialog(null, "La division es: " + operacion.dividir(num1, num2));
    JOptionPane.showMessageDialog(null, "El modulo es: " + operacion.modulo(num1, num2));

  }
}
