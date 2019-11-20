import java.util.*;
public class exer3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i;
		int a[] = new int[10];
		
		
		for (i=0; i<10; i++) {
			System.out.println("insira o numero");
			a[i] = in.nextInt();
			
		}
		
		for(i= 0; i<10; i++) {
			if(a[i]%2 == 0) {
				System.out.println("O numero "+(a[i])+" e primo");
			}if(a[i]%2>0) {
				System.out.println("O numero "+a[i]+" nao e primo" );
				 
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
