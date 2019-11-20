import java.util.*;

public class exer13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i, n=3;
		int a[] = new int[n];
		int b[] = new int[n];	
		for(i=0; i<n; i++){
			System.out.println("Insira os valores de A");
			a[i] = in.nextInt();
		}	
		 for (i=0; i<n; i++) {
			 
			    if (a[i]%2 == 0) {
			       b[i] = 1;
			       System.out.println("Os numeros pares  Sao:  "+b[i]+" e o numero � o:  "+a[i]);
			    }  else {
			    	b[i] = 0;
			    




				
			    }
		 } 
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
