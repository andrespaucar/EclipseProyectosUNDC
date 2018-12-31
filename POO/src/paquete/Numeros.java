package paquete;
import paquete.numero;
import javax.swing.JOptionPane;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        numero n=new numero();
        n.num1=Integer.parseInt(JOptionPane.showInputDialog("1° Num: "));
        n.num2=Integer.parseInt(JOptionPane.showInputDialog("2° Num: "));
        n.verificar(n.num1,n.num2);
        
	}
	

}

