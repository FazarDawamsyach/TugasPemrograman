import java.util.Scanner;

public class Tugas {
    public static void main(String [] args) {

 	Scanner input = new Scanner(System.in);
	int norumah;
	System.out.print("Masukkan No Rumah :");
	norumah=input.nextInt();
	System.out.println("Nomor Rumah = " +norumah);
        String nama = "Fazar Dawamsyach" ;
        String Nim  = "H1051171035" ;
        String prodi = "Sistem Komputer" ;
        String agama = "Islam" ;
        int angkatan = 2017 ;
        char kelas  = 'A' ;
        byte umur  = 18 ;
        double berat = 48.5 ;
        final int tahundaftar = 2017 ;
        int tahunlulus = 2021 ;
        String hobi1 = "Gaming" ;
        String hobi2 = "mendengarkan lagu" ;
        String motto = "No Pain,No Gain" ;
        boolean identitas = true ;
        int masabelajar = tahunlulus - tahundaftar;
 
        System.out.println("Nama : " + nama );
        System.out.println("NIM : " + Nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Agama : " + agama);
        System.out.println("Angkatan : " + angkatan);
        System.out.println("Kelas Siskom : " + kelas);
        System.out.println("Umur : " + umur + "tahun");
        System.out.println("Berat Badan : " + berat + "kg");
        System.out.println("Masa Belajar : " + masabelajar + "tahun");     
 	System.out.println("Hobi1 : " + hobi1);
        System.out.println("Hobi2 : " + hobi2);
        System.out.println("Motto Hidup : " + motto);
        }
}