import java.util.*;

public class exer14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i, num = 3;
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[3];

		for (i = 0; i < num; i++) {
			System.out.println("Insira os valores de A");
			a[i] = in .nextInt();
		}
		for (i = 0; i < num; i++) {
			System.out.println("Insira os valores de B");
			b[i] = in .nextInt();
		}

		for (i = 0; i < num; i++) {

			if (a[i] > b[i]) {
				c[i] = 1;
			}
			if (a[i] < b[i]) {
				c[i] = -1;
			}
			if (a[i] == b[i]) {
				c[i] = 0;
			}
		}

		for (i = 0; i < num; i++) {
			System.out.println(c[i]);
	
	
	
	
	
	
	
	
	
		}


	}

}