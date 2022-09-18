# Pascal-Pattern
public class Main
{
	public static void main(String[] args) {
	    int n = 4;
	     int c = 1;
	   // int t = 11;
	    for(int i=1;i<=n;i++){
	           for(int j = 1; j<=n-i;j++){
	               System.out.print(" ");
	           }
	           
	       for(int j = 1; j<=i;j++){
	        
	              System.out.print(c+" ");
	                c=c*(i-j)/j;
	              
	              
	        }
	      
	        
	       System.out.println();
	    }
	
	}
}
