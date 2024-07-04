import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        resultado();
        
    }
    public static double getDelta(double a,double b,double c){  
        double delta = (b*b)-(4*a*c);
        return delta;    
    }
    public static double getX1(double a ,double b ,double delta) {
        double x1=((-1*b) + Math.sqrt(delta)) / (2*a);
        return x1;
    }
    public static double getX2(double a ,double b ,double delta) {
        double x2=((-1*b) - Math.sqrt(delta)) / (2*a);
    
        return x2;
    }
    public static void resultado(){

        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com valor de A: "));

        while(a==0){
        JOptionPane.showMessageDialog(null,"O valor de A não pode ser zero a equação é do 2º grau !\n Digite outro valor !");
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o valor de A"));
             }

        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com valor de B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com valor de C: "));
        double delta=getDelta(a, b, c);

        if(delta>=0){
            double x1=getX1(a,b,delta);
            double x2=getX2(a,b,delta);       
            JOptionPane.showMessageDialog(null, "O valor de x1="+x1+" e o valor de x2 ="+x2,"Resultado",1);
        }else{
            JOptionPane.showMessageDialog(null,"Não há soluções que possam ser expressas com o conjunto dos números reais ");
        }
        
    }
}