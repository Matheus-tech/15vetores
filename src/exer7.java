import java.util.*;

public class exer7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		
		  int a[]= new int[15],b[]= new int[15], i=0, j=0,k=1,total;
		 
		    
		    while(i<15){
		        System.out.println("Digite o "+(i+1)+"° valor");
		        a[i]=in.nextInt();
		        i++;
		    }
		    i=0;
		    
		   while(i<15){
		        total=a[i];
		        k=a[i]-1;
		        while(k>0){
	    	        total=total*k;
	    	        k--;
		        }
		   b[i]=total;
		   total=1;
		   i++;
		   }
		    i=1;
		    System.out.println(" Vetor B:");
		    System.out.print(b[0]+"-");
		    while(i<14){
		        System.out.print(b[i]+"-");
		        i++;
		    }
		    System.out.print(b[14]);

		
		
		

	}

}
