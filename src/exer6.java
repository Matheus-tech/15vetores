import java.util.*;
public class exer6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		
		int a[] = new int[11];
		int b[] = new int[11];
		int i;
		
		for(i=0; i<11;i++) {
			System.out.println("Insiras os elementos de 'A'");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<11;i++) {
			b[i] = a[i];
			a[i] = a[i]*a[i];
			System.out.println("A potencia de: "+b[i]+" é igual a: "+a[i]);
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
