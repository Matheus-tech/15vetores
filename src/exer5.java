import java.util.*;
public class exer5 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);	
		
		int i, num;
		int a[] = new int[2];
		
		for(i=0; i<2; i++) {
			System.out.println("Insira os valores ");
			a[i] = in.nextInt();
		}
		
			for (i=0; i<2; i++) {
				for (num=1; num<=a[i]; num++) {
					if ((a[i] % num) == 0) {
						if (num == a[i]) {
							System.out.println(a[i]+" é divisivel por: "+num);
		    	  }else {
		    		  System.out.println(a[i]+" é divisivel por: "+num);
		    	  }
			}     
		}
	}
		
		
		
		

	}

}
