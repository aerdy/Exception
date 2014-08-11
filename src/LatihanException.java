import java.util.jar.JarOutputStream;


public class LatihanException {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		
		try {
			
			int c=a+b;
			System.out.println(c);
			System.out.println(b/a);
			System.out.println("hasilnya ");
			
		} catch (Exception e) {
			// TODO: handle exception
			int c=a-b;
			System.out.println("hahhf"+c);
		}
		
	}
}
