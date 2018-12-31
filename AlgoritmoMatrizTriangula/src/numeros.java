import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lleer=new Scanner(System.in);
		while (true) {
			int x=Integer.parseInt(lleer.nextLine());
			if (100>x && 7<=x) {
				if (x>50) {
					System.out.println("El numero ingresado es mayor que 50");
				}else{
					System.out.println("El numero ingresado es menor que 50");
				}
			}else{
				System.out.println("NUmmero ingresado fuera de rango");
			}
			
		}

	}

}
