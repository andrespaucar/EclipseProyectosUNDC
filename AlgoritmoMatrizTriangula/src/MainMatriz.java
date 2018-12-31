import javax.swing.JOptionPane;

public class MainMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l=0,b;
		double [][] a= new double [3][4];
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <=a.length; j++) {
				a[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		for (int j = 0; j < a.length; j++) {
			for (int i = j+1; i <= a.length; i++) {
				try {
					if (a[i][j]!=0) {
						l=a[i][j]/a[j][j];
					//	System.out.print(a[i][j-1]=0);	
					for (int k = j+1; k <= a.length; k++) {
						a[i][k]=a[i][k]-l*a[k][k];
						/*a[i][j]=0;
						a[i][j]=0;*/
				    	System.out.print(a[i][k]+" ");	
					}	
				  }else{
					  i=a.length+1;
				  }
						
					
				} catch (Exception e) {
					System.out.println(":( ");
					i=a.length+1;;
				}
				/*finally{
					System.out.println("Paso!");
				}/**/
				
			}
			System.out.println();
		}

	}

}
