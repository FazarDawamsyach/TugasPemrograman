import java.util.Scanner;
public class Tugasmodul4
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		int pil;
		System.out.print("Masukkan Pilihan : ");
		pil = masuk.nextInt();
		switch (pil) {
			case 1 : System.out.println("Naik Pesawat Terbang");
			break;
			case 2 : System.out.println("Naik Kereta Api");
			break;
			case 3 : System.out.println("Naik Bus");
			break;
			case 4 : System.out.println("Naik Taksi");
			break;
			case 5 : System.out.println("Naik Mobil Pribadi");
			break;
			case 6 : System.out.println("Naik Motor");
			break;
			default : System.out.println("Anda Salah memilih");
		}
	}
}

