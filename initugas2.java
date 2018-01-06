 import java.util.Scanner;
	public class initugas2 {
		public static void main(String args []) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Menghitung kecepatan akhir ");
		System.out.println("Vt adalah Vo + a x t ");
		System.out.print("Masukkan kecepatan awal : Vo = "); // m/s 
		double Vo1 = scan.nextDouble();
		System.out.print("Masukkan percepatan : a = "); //  m/s^2
		double a = scan.nextDouble();
		System.out.print("Masukkan waktu : t = "); // waktu dalam detik (s)
		double t1 = scan.nextDouble();
		double Vt = Vo1+a*t1;
		System.out.println("Nilai Kecepatan akhir adalah : Vt = "+Vt+" Meter / Sekon");
		
		
		
		
		
		System.out.println("Menghitung Jarak yang ditempuh saat t = ....?");
		System.out.println("Jarak adalah Vo*t + 1/2*a*t^2");
		System.out.print("Masukkan kecepatan awal : Vo = "); // m/s
		double Vo2 = scan.nextDouble();
		System.out.print("Masukkan waktu : t = "); // waktu dalam detik (s)
		double t2 = scan.nextDouble();
		System.out.print("Masukkan percepatan : a = "); // m/s^2
		double percepatan = scan.nextDouble();
		int pangkat = 2 ;
		double hasilpangkat = Math.pow(t2,pangkat);
		double S = (Vo2*t2)+0.5*percepatan*hasilpangkat;
		System.out.println("Hasil jaraknya adalah : S = "+S+" meter");
	}
	}

