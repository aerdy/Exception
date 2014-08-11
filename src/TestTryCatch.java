
public class TestTryCatch {
	public static void main(String[] args) {
		int j=1;
		int i=0;
		
		try{
			System.out.println("Try Block etertack" + " i= "+ i + " j ="+j);
			System.out.println(j/i);
			System.out.println("Block Try berakhir");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("terjadi Exception");
		}
		System.out.println("setelah block try");
		return;
		
	}

}
