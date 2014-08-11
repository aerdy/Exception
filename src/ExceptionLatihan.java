
public class ExceptionLatihan {
	public static void main(String[] args) {
		int a=1;
		int b=0;
		
		
		try {
			int c=a+b;
			System.out.println("hasil c ="+c);
			
			System.out.println(a/b);
		//hasilnya hanya di tunjukkan di dalam blok try saja...mengapa..??	
			// karena dalam exception merupakan suatu nilai ...
			// jadi bila di suatu eksekusi di dalam blog try menyatakan benar..
			// di dalam blok catch tidak di eksekusi lagi..
			
			// ok kita salahkan dalam blok try...
			
		} catch (Exception e) {
			// TODO: handle exception
		
		System.out.println("setelah try");
		}
		
	}

}
