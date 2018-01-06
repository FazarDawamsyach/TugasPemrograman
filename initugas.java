import java.util.Scanner;
public class initugas {

	public static void main (String args []) {
		
		Scanner Scan = new Scanner (System.in);
		for (String t = "YA"; t.equals("YA")|| t.equals("ya"); )
		{
			System.out.println("1.Luas Lingkaran");
			System.out.println("2.Luas segitiga");
			System.out.println("3.Luas persegi");
			System.out.println("4.Luas persegi panjang");
			
			System.out.print("masukkan angka : " ) ;
				int r = Scan.nextInt();		
		
		if (r==1) {
			System.out.println("Luas Lingkaran");
			System.out.print("masukkan jari jari = ");
			double jarijari = Scan.nextDouble();
			double hasilpangkat = Math.pow(jarijari,2);
			double luaslingkaran = 3.14*hasilpangkat;
			System.out.println("Luas lingkaran = "+luaslingkaran + " meter persegi");	
		} 
		else if (r==2) {
			System.out.println("Luas segitiga");
			System.out.print("Masukkan alas = ");
			double alas = Scan.nextDouble();
			System.out.print("Masukkan tinggi = ");
			double tinggi = Scan.nextDouble();
			double hasil2 = 0.5*alas*tinggi;
			System.out.println("Luas segitiga adalah = " +hasil2+ " meter persegi");
		} 
		else if (r==3) {
			System.out.println("Luas persegi");
			System.out.print("Masukkan sisi p = ");
			double sisi1 = Scan.nextDouble();
			double hasil3 = Math.pow(sisi1,2);
			System.out.println("Luas Persegi = "+hasil3 + " meter persegi");
		} 
		else if (r==4) {
			System.out.println("Luas persegi panjang");
			System.out.print("panjang = ");
				double p = Scan.nextDouble();
			System.out.print("Lebar= ");
				double l = Scan.nextDouble();
				double hasil3 = p*l;
			System.out.println("Luas persegi panjang adalah = "+hasil3+" meter persegi");
		} 
		else System.out.println("Rumus tidak tersedia");
			
		System.out.println("Lanjutkan YA/TIDAK");
			t=Scan.next();
}
		
}	

}
