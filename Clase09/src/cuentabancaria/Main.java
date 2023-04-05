package cuentabancaria;

import javax.swing.JOptionPane;

import cuentabancaria.Cuenta.Action;

public class Main {
  public static void main(String[] args) {
    Cuenta cuenta = new Cuenta("Foo Bar", "0x54fd", 0d);
    cuenta.setSaldo(30000d);

    String accion = JOptionPane.showInputDialog(null, "Inserte La accion");
    Double cuantity = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte la cantidad"));

    switch (accion.toLowerCase()) {
      case "retirar":
        cuenta.setSaldo(Action.Retirar ,cuantity);
        break;
      case "depositar": 
        cuenta.setSaldo(cuantity);
        break;
      case "duplicar":
        cuenta.setSaldo((a) -> a*2);
      default:
        JOptionPane.showMessageDialog(null, "La accion " + accion + " no es posible");
        return;
    }

    JOptionPane.showMessageDialog(null,
        "Cuenta no° " + cuenta.getNumeroCuenta() + "\n" +
            "de " + cuenta.getNombreTitualar() + "\n" +
            "con " + cuenta.getSaldo() + " $");
  }
}