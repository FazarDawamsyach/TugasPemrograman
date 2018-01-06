import java.util.Scanner;
public class rugi {
	public static void main(String args []) {
		
		Scanner scan = new Scanner (System.in);
		System.out.print("masukkan gaya : ");
		int gaya = scan.nextInt();
		System.out.print("masukkan jarak : ");
		int jarak = scan.nextInt();
		int hasil = jarak*gaya;
		System.out.println(" usaha : "+hasil);
		
		double rumus = 0.5;
		System.out.print("masukkan massa : ");
		double massa = scan.nextDouble();
		System.out.print("masukkan kecepatan : ");
		double V = scan.nextDouble();
		int pangkat = 2;
		double hasilpangkat = Math.pow(V,pangkat);
		double hasil2 = rumus*massa*hasilpangkat;
		System.out.println("Energi Kinetik = " +hasil2+ "joule");

		
	}
}

