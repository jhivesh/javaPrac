package pdfreader;
import java.util.Scanner;


public class wind {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MykeyIn = new Scanner(System.in);
		int arr[][] = { {0,1,2,3,4,8 }, {3}, {1,2,3,4,5,6,7,8,9} };
		//				0				1		2
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		for (int row =0;row < arr.length;row++) {
			
			for (int col=0;col < arr[row].length;col++) {
				
				System.out.print(arr[row][col]+ " \t");
			}
		}
		
		
	}

}
