import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Seraialization {

	public static void main(String[] args) {
		
		
		//Serialization
//		try {
//         Student s = new Student("Sanjith",23,"Male",95,"1234");
//         System.out.println(s);
//         System.out.println("Go to File and check");
//         
//         String path="C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\Serialization\\serial.txt";
//         FileOutputStream fos = new FileOutputStream(path);
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(s);
//         System.out.println("Serialization is completed");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		//DeSerialization 
		try {
	         
	         String path="C:\\Users\\VIVA\\OneDrive\\Documents\\FileHandling\\Serialization\\serial.txt";
	         FileInputStream fis = new FileInputStream(path);
	         ObjectInputStream ois = new ObjectInputStream(fis);
	         Student s =(Student)ois.readObject();
	         System.out.println(s);
	         System.out.println("DeSerialization is completed");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

}
