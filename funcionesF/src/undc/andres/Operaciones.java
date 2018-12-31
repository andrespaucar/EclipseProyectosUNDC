package undc.andres;

import javax.swing.JOptionPane;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* int x,y,sum,res,mult;
     double div;
     x=Integer.parseInt(JOptionPane.showInputDialog("Num x: "));
     y=Integer.parseInt(JOptionPane.showInputDialog("num y: "));
     /*sum=suma(x,y);
     res=resta(x,y);
     mult=multiplicacion(x,y);
     div=divicion(x,y);/*
     JOptionPane.showMessageDialog(null, "La Suma: "+sum);
     JOptionPane.showMessageDialog(null, "Resta: "+res);
     JOptionPane.showMessageDialog(null, "Multiplicacion: "+mult);
     JOptionPane.showMessageDialog(null, "Divicion: "+div);*/
    mostrar(
    		);
     /*boolean salir=false;
     while (salir==false) {
    	int operacion=Integer.parseInt(JOptionPane.showInputDialog("Diga Opcion"+"\n1.Suma\n2.Resta\n3.Multiplicacion"
    	     		+ "\n4.Divicion \n5.Salir"));
     switch (operacion) {
	case 1:
	    JOptionPane.showMessageDialog(null, "La Suma: "+sum);
		break;
	case 2:
	    JOptionPane.showMessageDialog(null, "Resta: "+res);
     break;
	case 3:
	    JOptionPane.showMessageDialog(null, "Multiplicacion "+mult);
     break;
	case 4:
	    JOptionPane.showMessageDialog(null, "Divicion: "+div);
     break;
	case 5:
		JOptionPane.showMessageDialog(null, "Graciass.. :"); 
	salir=true;
	default:
	break;
	}
     }*/
     /*OPERACIONES*/
	}
	static int suma(int x,int y){
		int s;
		s=x+y;
		return (s);
	}
	static int resta(int x,int y){
		int r;
		r=x-y;
		return (r);
	}
	static int multiplicacion(int x,int y){
		int m;
		m=x*y;
		return (m);
	}
	static float divicion(float x,float y){
		float d;
		d=x/y;
		return (d);
	}
	static void mostrar(){
		  int x,y,sum,res,mult;
		 float div;
		 x=Integer.parseInt(JOptionPane.showInputDialog("Num x: "));
	     y=Integer.parseInt(JOptionPane.showInputDialog("num y: "));
		 sum=suma(x,y);
	     res=resta(x,y);
	     mult=multiplicacion(x,y);
	     div=divicion(x,y);
	    boolean salir=false;
	     while (salir==false) {
	    	int operacion=Integer.parseInt(JOptionPane.showInputDialog("Diga Opcion"+"\n1.Suma\n2.Resta\n3.Multiplicacion"
	    	     		+ "\n4.Divicion \n5.Salir"));
	     switch (operacion) {
		case 1:
		    JOptionPane.showMessageDialog(null, "La Suma: "+sum);
			break;
		case 2:
		    JOptionPane.showMessageDialog(null, "Resta: "+res);
	     break;
		case 3:
		    JOptionPane.showMessageDialog(null, "Multiplicacion "+mult);
	     break;
		case 4:
		    JOptionPane.showMessageDialog(null, "Divicion: "+div);
	     break;
		case 5:
			JOptionPane.showMessageDialog(null, "Graciass.. :"); 
		salir=true;
		default:
		break;
		}
	     }
	}

}

