import java.util.Scanner;
public class Tugasmodul2nomor2 {
public static void main(String args []){

	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan jari jari : ");
	double phi = 3.14;
	double r = input.nextDouble();
	System.out.println("Menghitung Keliling Lingkaran");
	System.out.println("=============================");
	System.out.println("Rumus Keliling : 2*Phi*r");
	System.out.println("Jari jari adalah : " + r );
	System.out.println(2*phi*r);
	System.out.println("");
	System.out.println("Menghitung Luas Lingkaran");
	System.out.println("=============================");
	System.out.println("Rumus Luas : Phi*r^2 ");
	System.out.println("Jari jari adalah : " + r );
	System.out.println(phi*r*r);
	
}
}

