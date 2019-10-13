import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;


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
		// TODO AuHashSet<E>rated method stub
      
		
		HashSet <String> hst = new HashSet<String>();
		HashSet <String> hst1 = new HashSet<String>();
		
		// calling add method 
		hst.add("I");
		String a = "love";
		hst.add(a);
		hst.add("coding");
		
		System.out.println("the values in hashset is :"+hst);
	
		
		// removing all elements from the sets
		hst.clear();
		
		hst.add("I");
		hst.add("love");
		hst.add("JAva");
		
		// cloning object hashset 
		
		hst1 =  (HashSet)  hst.clone();
		// display second hashset 
		System.out.println("the values in hashSet is"+hst1);
		
		// method calling 
		
		if (hst.contains("love")) {
			System.out.println("You are an lover of cs;; Developer..");
		}
		else {
			System.out.println("contain method not working");
		}
		
		
		
	}

}
