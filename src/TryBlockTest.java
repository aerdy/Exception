
import java.io.IOException;
public class TryBlockTest {
	public static void main(String[] args) throws IOException{
		int[] x = {10, 5, 0};
		try{
		System.out.println("Blok try pertama");
		System.out.println("hasil = " + divide(x,0));
		x[1] = 0;
		System.out.println("hasil = " + divide(x,0));
		x[1] = 1;
		System.out.println("hasil = " + divide(x,1));
		} catch(ArithmeticException e){
		System.out.println("Arithmetic exception");
		} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index-out-of-bounds exception");
		}
		System.out.println("\nTekan Enter untuk keluar");
		try{
		System.out.println("blok try kedua");
		System.in.read();
		return;
		}catch(IOException e){
		System.out.println("I/O exception ");
		}finally{
		System.out.println("blok finally");
		}
		
		public static int divide(int[] array, int index){
			try{
			System.out.println("\nblok try pertama");
			array[index + 2] = array[index]/array[index + 1];
			return array[index + 2];
			}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
			}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index-out-of-bounds exception");
			}finally{
			System.out.println("blok finally");
			}
			return array[index + 2];
			}
			}

}
