import java.util.*;
public class exer2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i,n=1 ;
		int a[] = new int[5];
		int b[] = new int[10];
		
		for(i=0; i<5; i++) {
		System.out.println("Insira os valores de a");
		a[i] = in.nextInt();
		}
		
		for(i=0; i<10; i++) {
		b[0] = a[0]*n;
			System.out.println("A tabuada de: "+a[0]+" é:");
			System.out.println(b[0]);
			n++;
		}
		
		for(i=0; i<10; i++) {
			b[1] = a[1]*n;	
			System.out.println("A tabuada de: "+a[1]+" é:");
			System.out.println(b[1]);
			n++;
		}
			
		for(i=0; i<10; i++) {
			b[2] = a[2]*n;	
			System.out.println("A tabuada de: "+a[2]+" é:");
			System.out.println(b[2]);
			n++;
		}
			
		for(i=0; i<10; i++) {
			b[3] = a[3]*n;	
			System.out.println("A tabuada de: "+a[3]+" é:");
			System.out.println(b[3]);
			n++;
		}
			
		for(i=0; i<10; i++) {
			b[4] = a[4]*n;		
			System.out.println("A tabuada de: "+a[4]+" é:");
			System.out.println(b[4]);
			n++;
		}
			
		
		
		
		

	}

}
