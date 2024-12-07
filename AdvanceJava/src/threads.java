
public class threads {

	public static void main(String[] args) {
		
		try {
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
			Thread.sleep(50);
		}
		}
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
