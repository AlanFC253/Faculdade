import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double a,b,c,x1,x2,delta;
		
	System.out.println("Escreva o valor de A:");
	
		a = sc.nextDouble();
	
	System.out.println("Escreva o valor de B:");
	
		b = sc.nextDouble();
	
	System.out.print("Escreva o valor de C:");
	
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4*(a*c);
		
		x1 = (-b + Math.sqrt(delta) ) / 2*a;
	
		x2 = (-b - Math.sqrt(delta) ) / 2*a; 

        System.out.println("");
	
		System.out.printf("x1 vale: %.2f ", x1);
	
		System.out.println("");
				
		System.out.printf("x2 vale: %.2f", x2);
		
		System.out.println("");

        sc.close();
			}
}