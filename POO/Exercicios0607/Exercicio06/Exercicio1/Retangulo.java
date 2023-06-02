package Exercicio1;

public class Retangulo extends Triangulo{
// Alan Fernandes Cavalcante
// Rgm:52953004-1
    public Retangulo(double base, double altura) {
        super(base, altura);        
    }

    @Override
    double area() {
        double area = getBase()*getAltura();
        return area;
    }
    
    @Override
    double perimetro() {
        double perimetro = (getBase()*getAltura())*2;
        return perimetro;
    }

    @Override
    void mostrar() {
        System.out.println("A Base desse Retangulo é:" +getBase());
        System.out.println("A altura desse Retangulo é:" +getAltura());
        System.out.println("A area desse Retangulo é:" +area());
        System.out.println("O perimetro desse Retangulo é:" +perimetro());
        System.out.println();
    }
}
