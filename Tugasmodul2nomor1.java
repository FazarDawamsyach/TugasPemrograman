import java.util.Scanner;
public class Tugasmodul2nomor1 {
public static void main(String args []){

	Scanner input = new Scanner(System.in);
	System.out.print("Bilangan 1 : ");
	int bil1 = input.nextInt();
	System.out.print("Bilangan 2 : ");
	int bil2 = input.nextInt();
	System.out.println("Hasil Operator Aritmatika");
	System.out.println("=========================");
	System.out.println("Jumlah : " + (bil1+bil2));
	System.out.println("Kurang : " + (bil1-bil2));
	System.out.println("Kali   : " + (bil1*bil2));
	System.out.println("Bagi   : " + (bil1/bil2));
	System.out.println("Sisa   : " + (bil1%bil2));
	
	}
	}
	