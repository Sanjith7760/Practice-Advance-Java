import java.util.*;
public class OutOfMemoryError {
    
	//This leads to OutOfMemoryError so we can handle by catching the error
	public static void main(String[] args) {
		try {
		ArrayList<int[]> list=new ArrayList<>();
		while(true) {
			list.add(new int[100000]);
		}
		}
		catch(Error e) {
			System.out.println("Error is handled");
		}

	}

}
