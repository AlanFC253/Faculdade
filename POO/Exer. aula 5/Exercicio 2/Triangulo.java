public class Triangulo {
    private double base;
    private double altura;


    //Construtores
    public Triangulo() {

    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }


    // Settes
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Outros metodos


    public double calcularArea() {
        double area = this.base*this.altura/2;
        return area;
    }

    public void imprimirDados() {
        System.out.println("A base desse triangulo é: "+this.getBase());
        System.out.println("A altura desse triangulo é: "+this.getAltura());
        System.out.println("A base desse triangulo é: "+calcularArea());
        System.out.println();
    }

}
