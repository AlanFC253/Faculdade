package Exercicio1;

public class Triangulo extends Forma{
    // Alan Fernandes Cavalcante
    // Rgm:52953004-1
    private double base;
    private double altura;
    
    public Triangulo(double base,double altura){
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    double area() {
       double area = this.base*this.altura/2;
       return area;
    }

    @Override
    void mostrar() {
        System.out.println("A base desse triangulo é:"+getBase());
        System.out.println("A altura desse triangulo é:"+getAltura());
        System.out.println("A area desse triangulo é:"+area());
        System.out.println();
    }

    @Override
    double perimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimetro'");
    }
    
}
