import java.util.Scanner;

public class EjercicioRangoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lleer=new Scanner(System.in);
		int x=lleer.nextInt();
		int y=lleer.nextInt();
		int s = 0,p=0,t=0;
		if(x>y){
			for (int i = y; i <=x; i++) {
				System.out.println(i);
				t=t+1;
				if(i%2==0){
				p=p+i;s=s+1;
			   }
		     }
			System.out.println("En total hay: "+t);
			System.out.println("Suma de pares: "+p);
			System.out.println("Cantidad de pares: "+s);

	}
		else{
			for (int i = x; i <=y; i++) {
				System.out.println(i);
				t=t+1;
				if(i%2==0){
				p=p+i;s=s+1;
			   }
		     }
			System.out.println("Suma de pares: "+p);
			System.out.println("En total hay: "+t);
			System.out.println("Cantidad de pares: "+s);
		}


}}