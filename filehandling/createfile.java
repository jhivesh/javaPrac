import java.util.*;
import java.lang.*;
import java.io.File;
public class createfile {
	
	//an object
	private Formatter x;
	
	//==========================================================//
	//methd to create and open file 
	public void openFile() {
		try {
			x = new Formatter("freddy.txt");
		}catch(Exception e){
			System.out.println("You have an error");
		}
	}
	//==========================================================//
	public void addrec() {
		x.format("Training Data set", "Testing data");
	}
	//==========================================================//
	public void closeFile() {
		x.close();
	}
	//==========================================================//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createfile g = new createfile();
		
		g.openFile();
		g.addrec();
		g.closeFile();

	}
}
