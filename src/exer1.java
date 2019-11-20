import java.util.*;
public class exer1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, r;
		
		int a[] = new int[20];
		int b[] = new int[20];
		
			for(i=0; i<20; i++) {
				System.out.println("Insira os valores");
				a[i] = in.nextInt();		
			}
			
			for(i=0; i<20; i++) {
				if((a[i]%2) == 0 ) {
					b[i] = a[i];
					System.out.println("par: "+b[i]);
				}
			}
			for(i=0; i<20; i++) {
				if((a[i]%2) != 0 ) {
					b[i] = a[i];
					System.out.println("Impar: "+b[i]);
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
