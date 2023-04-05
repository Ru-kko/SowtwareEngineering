package parcial;

public class App {
  public static void main(String[] args) throws Exception {
    EmpresTransporte empresa1 = new EmpresTransporte("Foo", 10, 15);
    EmpresTransporte empresa2 = new EmpresTransporte("Bar", 5, 9);

    System.out.println(empresa1);
    System.out.println(empresa2);

    System.out.println("Costo de envio de empres " + empresa1.getNombre() + " es: " + empresa1.costeEnvio(100d, 100d));
    System.out.println("Costo de envio de empres " + empresa2.getNombre() + " es: " + empresa1.costeEnvio(100d, 100d, 100));

    empresa1.setTotalDrivers(15);
    empresa2.setTotalVehicles(30);

    System.out.println(empresa1);
    System.out.println(empresa2);
  }
}
