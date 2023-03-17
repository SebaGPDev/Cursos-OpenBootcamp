class Main {
  
  public static int suma(int num, int num2, int num3) {
    int sume = num + num2 + num3;
    return sume;
  }
  
  public static void main(String args[]) {
    int num = 2;
    int num2 = 2;
    int num3 = 2;
    int resultado = suma(num, num2, num3);
    System.out.println(resultado); 

    Coche miCoche = new Coche(4);
    miCoche.agregarPuertas(1);
    System.out.println(miCoche.getNumPuertas());
  }

}

class Coche {
  private int numPuertas;

  public Coche(int numPuertas) {
    this.numPuertas = numPuertas;
  }
  
  public void agregarPuertas(int cantidad) {
    this.numPuertas += cantidad;
  }

  public int getNumPuertas() {
    return numPuertas;
  }

}
