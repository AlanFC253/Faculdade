import java.util.Scanner;

public class  Exercicio5{
    public static void main(String[] args) {
        double celsius,fahrenheit,kelvin;

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor em Celsius: ");
        celsius=sc.nextDouble();
        
        sc.close();

        fahrenheit=1.8*celsius+32;
        kelvin=celsius+273;

        System.out.printf("Fahrenheit: %.2f , e em Kelvin: %.2f ",fahrenheit,kelvin);
    }
}