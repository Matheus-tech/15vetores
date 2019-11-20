import java.util.*;
public class exer8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, j,n=4,aux=0,aj ;
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		
		for(i=0;i<3;i++) {
			System.out.println("Informe o numero");
			a[i] = in.nextInt();
		}
		
		for(i=0;i<3;i++) {
			aux=0;
			for(j=i;j<3;j++) {
				aux= aux+a[i];
				
			}
			b[i] = aux;
		}
		
		for(i=0;i<3;i++) {
			System.out.println("A somatoria de: "+a[i]+" é: "+b[i]);
		}
		
		
		
		
		
		
		
		
		

	}

}
