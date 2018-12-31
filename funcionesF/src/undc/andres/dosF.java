package undc.andres;

import javax.swing.JOptionPane;

public class dosF {
	public static void main (String [] args){
		int num,x,y,p; 
		num=Integer.parseInt(JOptionPane.showInputDialog("N: " ));
		mostrar(num);
		
		x=Integer.parseInt(JOptionPane.showInputDialog("x: "));
		y=Integer.parseInt(JOptionPane.showInputDialog("y: "));
        p=producto(x,y);
        JOptionPane.showMessageDialog(null, "El producto: "+p);
	}

	static void mostrar(int num){
		for (int i = 0; i <=num; i++) {
			JOptionPane.showMessageDialog(null, "En proceso...");
			
		}
	}
	static int producto(int x, int y){
		int z;
		z=x*y;
		return(z);
		
	}
}
