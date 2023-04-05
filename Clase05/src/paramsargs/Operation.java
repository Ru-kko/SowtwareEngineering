package paramsargs;

public class Operation {

  public Integer sumar(Integer sumandoA, Integer sumandoB) {
    Integer suma = sumandoA + sumandoB;
    return suma;
  }

  public Integer restar(Integer sustraendo, Integer minuendo) {
    Integer diferencia = sustraendo - minuendo;
    return diferencia;
  }

  public Integer multiplicar(Integer factorA, Integer factorB) {
    Integer producto = factorA * factorB;
    return producto;
  }

  public Float dividir(Integer dividendo, Integer divisor) {
    Float cociente = dividendo / (float)divisor;
    return cociente;
  }

  public Integer modulo(Integer dividendo, Integer divisor) {
    Integer resto = dividendo % divisor;
    return resto;
  }

}
