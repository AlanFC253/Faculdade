package Exercicio1;

public class Circunferencia extends Forma{
    // Alan Fernandes Cavalcante
    // Rgm:52953004-1
   private double raio;

    public Circunferencia(double raio){
        setRaio(raio);
    }
   
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    double area() {
        double area = Math.PI*(this.raio*this.raio);
        return area;
    }

    @Override
    void mostrar() {
        System.out.println("Raio dessa Circunferencia :"+getRaio());
        System.out.println("Area dessa Circunferencia :"+area());
        System.out.println("Perimetro dessa Circunferencia :"+perimetro());
        System.out.println();
    }

    @Override
    double perimetro() {
      double perimetro =2*Math.PI*this.raio;
      return perimetro;
    }
}
