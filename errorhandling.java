import java.util.*;
/**
 * 
 */

/**
 * @author Abhishek Subron
 *
 */
public class While {

	/**
	 * @param args
	 */
public static void main(String[] args) {
	int x =1;
	do {
		try {
	    	 Scanner myKeyIn = new Scanner(System.in);
	         System.out.println("Enter first num");
	         
	         int n1 = myKeyIn.nextInt();
	         System.out.println("enter second num");
	         int n2 = myKeyIn.nextInt();
	         int sum = n1 / n2;
	         System.out.println("The sum is "+ sum);
	          x =2;
		}
	     catch (Exception e) {
			// TODO: handle exception
	    	 System.out.println("you cannot do that ");
	    	 
		}
	} while (x ==1);
     
    
      
	}

}
