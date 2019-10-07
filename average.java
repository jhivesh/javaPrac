import java.util.Scanner;
public class Average 
	{

	public static void main(String[] args)
		{
		                                                              // declaring scanner , variables
         Scanner myKeyIn = new Scanner(System.in);
         double sum = 0 ;
         int count = 0 ;
         double  average;
         int choice;
         
                                                             //This while loop will continue to loop until choice = 1 or 2 
           do{  
        	   System.out.println("You are required to enter a choice ");
               System.out.println("Press 1 to continue ! \t  Press 2 to exit !");
        	  choice = myKeyIn.nextInt();
           	}
           while (choice  != 1 && choice != 2 ) ;
           
                   //
              do  
              {      
                 if (choice == 1)   
                 {                                                     // display message to enter number //
                   System.out.println("enter  4 numbers :");
                   double  number = myKeyIn.nextInt();
         
                   sum = sum + number;	 
                   count++;
                  } 
                    if (choice == 2 )
                   { 
                	 System.out.print("Program has exit ");  
                   }
                 
            }
            while  ((count <= 3 ) & (count >= 0)   );
         
                 
         average = sum / 4;
         System.out.print("the average is : "+ average);
         myKeyIn.close();
	}

}
