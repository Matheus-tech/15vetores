import java.util.*;
public class exer10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, n=4,  posi = 0;
		
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		
		for(i= 0 ; i<4; i++){
			System.out.println("Insira os elementos de A");
			a[i] = in.nextInt();
		}
		
		for(i= 0 ; i<n; i++){
			System.out.println("Insira os elementos de B");
			b[i] = in.nextInt();
		}
		
		for(i= 0 ; i<n; i++){
			posi = 0;
			for(i= 0 ; i<n; i++){
				if(a[i] == b[i]) {
					posi = n+1;
				}else {
					posi = 0;
				}
				if(posi == 0) {
					c[i] = a[i];
					
				}
			}
		}
		
		for(i= 0 ; i<n; i++){
			System.out.println("Elementos de A: "+a[i]);
			System.out.println("Elementos de B: "+b[i]);
			System.out.println("Elementos de C: "+c[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
