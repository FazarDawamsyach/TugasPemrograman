import java.util.Scanner;
public class Miniproject5
{
	public static void main(String[] args)
	{
		Scanner Scan= new Scanner(System.in);	 
		System.out.println("============================================================");
		System.out.println("                 Daftar Operator Matematika                 ");
		System.out.println("============================================================");
		System.out.println(" 1. Pengurangan");
		System.out.println(" 2. Penjumlahan");
		System.out.println(" 3. Perkalian");
		System.out.println(" 4. Pembagian");
		System.out.println(" 5. Sisa Pembagian");
		System.out.println("============================================================");
		
		int x=1;
		while(x >= 1){
			while (x>=1){
			System.out.print("Masukkan Daftar Operator Matematika : ");
			int MO= Scan.nextInt();
		if (MO == 1){
				System.out.println(MO+". Pengurangan");
			System.out.println("(-) digunakan untuk operasi pengurangan");
			System.out.println("Contoh 1 : ");
			System.out.print("Masukan nilai : ");
			int a= Scan.nextInt();
			System.out.print("Masukan nilai : ");
			int b= Scan.nextInt();
			int c= a-b;
			System.out.println("nilai dari pengurangan bilangan tersebut adalah "+c);
		} else if (MO == 2){
			System.out.println(MO+". Penjumlahan");
			System.out.println("(+) digunakan untuk operasi Pertambahan");
			System.out.println("Contoh 2 : ");
			System.out.print("Masukan nilai : ");
			int d= Scan.nextInt();
			System.out.print("Masukan nilai : ");
			int e= Scan.nextInt();
			int f= d+e;
			System.out.println("nilai dari penjumlahan bilangan tersebut adalah "+f);
		} else if (MO == 3){
			System.out.println(MO+". Perkalian");
			System.out.println("(*) digunakan untuk operasi Perkalian");
			System.out.println("Contoh 3 : ");
			System.out.print("Masukan nilai : ");
			int g= Scan.nextInt();
			System.out.print("Masukan nilai : ");
			int h= Scan.nextInt();
			int i= g*h;
			System.out.println("nilai dari perkalian bilangan tersebut adalah "+i);
		} else if (MO == 4){
			System.out.println(MO+". Pembagian");
			System.out.println("(/) digunakan untuk operasi pembagian");
			System.out.println("Contoh 4 : ");
			System.out.print("Masukan nilai : ");
			int j= Scan.nextInt();
			System.out.print("Masukan nilai : ");
			int k= Scan.nextInt();
			int l= j/k;
			System.out.println("nilai dari pembagian bilangan tersebut adalah "+l);
			System.out.println("(%) digunakan untuk operasi sisa pembagian");
		} else if (MO == 5){
			System.out.println(MO+". Sisa Pembagian");
			System.out.println("Contoh 5 : "); 
			System.out.print("Masukan nilai : ");
			int m= Scan.nextInt();
			System.out.print("Masukan nilai : ");
			int n= Scan.nextInt();
			int o= m%n;
			System.out.println("nilai dari modulo bilangan tersebut adalah "+o);
		} else {
			System.out.println ("Maaf Daftar Operator Aritmatika Yang Anda Inginkan Tidak Ada");}
			if (MO < 5) break ;
			}
		System.out.println("apakah anda ingin melanjutkan? jika YA tekan angka yang bukan 0 dan jika TIDAK tekan angka 0");
			int masuk = Scan.nextInt();
			if(masuk==0) break;
		}
	System.out.println("apakah anda ingin melanjutkan? jika YA tekan angka yang bukan 0 dan jika TIDAK tekan angka 0");
			int masuk = Scan.nextInt();
			if(masuk==0) break;
	}
}

