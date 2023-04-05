package parcial;

public class EmpresTransporte {
  private String nombre;
  
  private static final Integer TARIFA = 100000;
  private static final Integer ADICIONAL_DISTANCIA = 1000;
  private static final Integer ADICIONAL_PESO= 1000;
  private static final Integer ADICIONAL_PASAJEROS = 1000;

  private Integer totalVehicles;
  private Integer totalDrivers;
  
  public EmpresTransporte(String nombre, Integer totalVehicles, Integer totalDrivers) {
    this.nombre = nombre;
    this.totalVehicles = totalVehicles;
    this.totalDrivers = totalDrivers;
  }
  
  public String getNombre() {
    return nombre;
  }

  public Integer getTotalVehicles() {
    return totalVehicles;
  }

  public void setTotalVehicles(Integer totalVehicles) {
    this.totalVehicles = totalVehicles;
  }

  public Integer getTotalDrivers() {
    return totalDrivers;
  }

  public void setTotalDrivers(Integer totalDrivers) {
    this.totalDrivers = totalDrivers;
  }

  public Double costeEnvio(Double distancia, Double peso) {
    return TARIFA + (ADICIONAL_DISTANCIA * distancia) + (ADICIONAL_PESO * peso);
  }

  public Double costeEnvio(Double distancia, Double peso , Integer numeroPasajeros) {
    return TARIFA + (ADICIONAL_DISTANCIA * distancia) + (ADICIONAL_PESO * peso) + (ADICIONAL_PASAJEROS * numeroPasajeros);
  }

  @Override
  public String toString() {
    return "EmpresTransporte [nombre=" + nombre + ", totalVehicles=" + totalVehicles + ", totalDrivers=" + totalDrivers
        + "]";
  }
}
