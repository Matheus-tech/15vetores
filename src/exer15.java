import java.util.*;
public class exer15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, n=2,j, aux,aux1;
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		
		
		for(i=0; i<n; i++) {
			System.out.println("Insira os elementos de A");
			a[i] = in.nextInt();
					
		}
		
		
		for(i=0; i<(n-1); i++) {
			aux1 =i;
			for(j=(i+1); j<n; j++) {
				if(a[j] < b[i]) {
					aux1 = j;
				}
			}
		 aux = a[i];
		 a[i] = b[i];
		 b[i] = aux;
		}
		
		for(i=0; i<(n-1); i++) {
			aux1 =i;
			for(j=(i+1); j<n; j++) {
				if(a[j] > c[i]) {
					aux1 = j;
				}
				 aux = a[i];
				 a[i] = c[i];
				 c[i] = aux;
			}
		
		}
		
		for(i=0; i<n;i++) {
			System.out.println("Ordem Crescente: "+b[i]);
			System.out.println("Ordem Decrecente: "+c[i]);
		}
		
		
		

	}

}
