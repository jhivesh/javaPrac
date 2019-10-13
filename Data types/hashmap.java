import java.util.*;
/**
 * 
 */

/**
 * @author Abhishek Subron
 *
 */
public class p1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. define object of hashmap class
		
		HashMap<String,String > hm = new HashMap<String , String>();
		
		hm.put("AFG", "Afghanistan");
		hm.put("ALA", "Aladin");
		hm.put("MUR", "Mauritius");
		hm.put("FRA", "France");
		hm.put("DEU","Germany");
		hm.put("IND", "India");
		
		// duplicate items are overlaps
		hm.put("ALA", "Åland Islands");
		hm.put("UK", "United States");
		hm.put("US", "United States");
		hm.put("ITA", "Italy");
		hm.put("KEN", "Kenya");
		hm.put("SYC", "Seychelles");
	
		
		
		// 2. Display key value pairs using for loops 
		
		for (Map.Entry<String, String> m : hm.entrySet()) {
			
			// Using Getkey and getvalue methods to retreive key and correspinding information
			System.out.println(m.getKey() + " : " + m.getValue());
			
		}
		System.out.println(hm.get("IND")+" "+"is an wonderful place to visit");
		
		// checking size of hashmap :hm
		System.out.println("Size of Hashmap is "+ hm.size());
		
		Scanner myKeyIn = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Enter a three letter country code in UPPERCASE ");
		String mQuery = myKeyIn.next();
		
		for (Map.Entry<String, String> mQ : hm.entrySet() 	) {
			
			if (mQ.getKey().equals(mQuery) ) {
				System.out.println(mQ);
	
			}
			
		}
		
		
		
	}

}
