import java.util.Scanner;
	public class contohbulan {
		public static void main (String args[]) {
		
		Scanner masuk =  new Scanner (System.in);
		int nil;
		System.out.print("Masukkan bulan : " ) ;
		nil = masuk.nextInt();
		switch(nil) {
			case 1 :
				System.out.println("Januari ");
				System.out.println("Musim dingin ");
			
			case 2 :
				System.out.println("Februari");
				System.out.println("Musim Dingin ");
			
			case 3 :
				System.out.println("Maret ");
				System.out.println("Musim Semi ");
				break;
			case 4 :
				System.out.println("April");
				System.out.println("Musim Semi");
			case 5 :
				System.out.println("Mei");
				System.out.println("Musim Semi");
			case 6 :
				System.out.println("Juni");
				System.out.println("Musim Panas");
			case 7 :
				System.out.println("Juli");
				System.out.println("Musim Panas");
			case 8 :
				System.out.println("Agustus");
				System.out.println("Musim Panas");
			case 9 :
				System.out.println("September");
				System.out.println("Musim Gugur");
			case 10 :
				System.out.println("Oktober");
				System.out.println("Musim Gugur");
			case 11 :
				System.out.println("November");
				System.out.println("Musim Gugur");
			case 12 :
				System.out.println("Desember");
				System.out.println("Musim Dingin");
				break;
			default :
				System.out.println("Bulan madu ");
		}
		}
	}
	